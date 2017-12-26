package org.biz.banana.provider.service.dispose;

import org.biz.banana.provider.service.BaseServiceDispose;
import org.springframework.stereotype.Service;

import com.appleframework.model.Dto;

@Service("topic_demo3")
public class UserServiceDisposeImpl implements BaseServiceDispose {

	@Override
	public Dto dispose(Dto dto) {
		Long userId = (Long)dto.get("userId");
		String name = (String)dto.get("name");
		Integer age = (Integer)dto.get("age");
		System.out.println("userId:" + userId +",name:"+name+",age:"+age);
		return null;
	}

}