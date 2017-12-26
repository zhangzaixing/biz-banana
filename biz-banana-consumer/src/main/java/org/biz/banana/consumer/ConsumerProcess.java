package org.biz.banana.consumer;

import org.biz.banana.bean.User;
import org.biz.banana.provider.util.Constant;

/**
 * 
 *ConsumerProcess class
 *
 *@author zzx
 *@date 2017年12月26日 上午10:08:41
 */
public class ConsumerProcess {
	public static void process(String topic, Object obj) {
		if(Constant.TOPIC_DEMO2.equals(topic)) {
			if(obj instanceof User) {
				User user = (User)obj;
				System.out.println("user.id:" + user.getId());
			}
		}
	}
}
