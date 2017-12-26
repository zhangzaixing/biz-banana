package org.biz.banana.consumer;

import org.biz.banana.bean.User;
import org.biz.banana.provider.util.Constant;

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
