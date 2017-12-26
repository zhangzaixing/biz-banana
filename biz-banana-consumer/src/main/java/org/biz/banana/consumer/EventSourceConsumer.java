package org.biz.banana.consumer;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.appleframework.jms.core.utils.ByteUtils;
import com.appleframework.jms.kafka.consumer.MessageAndMetadataConsumer;
import com.appleframework.model.DefaultDto;
import com.appleframework.model.Dto;

import kafka.message.MessageAndMetadata;

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
				ChatEventHandleBus.handle(topic, data);
			} else if(object instanceof HashMap) {
				Map<String, Object> data = (Map<String, Object>)object;
				Dto dto = new DefaultDto();
				dto.addParameters(data);
				ChatEventHandleBus.handle(topic, dto);
			} else {
				ConsumerProcess.process(topic, object);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}
		
	}

}
