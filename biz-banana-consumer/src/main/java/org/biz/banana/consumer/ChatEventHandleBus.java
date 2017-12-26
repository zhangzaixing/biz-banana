package org.biz.banana.consumer;

import org.biz.banana.provider.service.BaseServiceDispose;

import com.appleframework.core.utils.SpringUtility;
import com.appleframework.model.Dto;

/**
 * 
 *ChatEventHandleBus class
 *
 *@author zzx
 *@date 2017年12月26日 上午10:08:35
 */
public class ChatEventHandleBus {
	
	public static void handle(String topic, Dto dto) {
		BaseServiceDispose serviceDispose = (BaseServiceDispose)SpringUtility.getBean(topic);
		serviceDispose.dispose(dto);
	}
}
