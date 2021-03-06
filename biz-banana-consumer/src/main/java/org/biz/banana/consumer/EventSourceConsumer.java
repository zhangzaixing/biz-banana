package org.biz.banana.consumer;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.appleframework.jms.core.utils.ByteUtils;
import com.appleframework.jms.kafka.consumer.MessageAndMetadataConsumer;
import com.appleframework.model.DefaultDto;
import com.appleframework.model.Dto;

import kafka.message.MessageAndMetadata;

/**
 * 
 *EventSourceConsumer class
 *
 *@author zzx
 *@date 2017年12月26日 上午10:08:52
 */
public class EventSourceConsumer extends MessageAndMetadataConsumer {

	protected final static Logger logger = Logger.getLogger(EventSourceConsumer.class);
	
	@SuppressWarnings("unchecked")
	@Override
	public void processMessage(MessageAndMetadata<byte[], byte[]> message) {
		String topic = message.topic();
		try{
			Object object = ByteUtils.fromByte(message.message());
			if(object instanceof Dto) {
				Dto data = (Dto)object;
				BananaEventHandleBus.handle(topic, data);
			} else if(object instanceof HashMap) {
				Map<String, Object> data = (Map<String, Object>)object;
				Dto dto = new DefaultDto();
				dto.addParameters(data);
				BananaEventHandleBus.handle(topic, dto);
			} else {
				StreamProcessImpl.process(topic, object);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}
		
	}

}
