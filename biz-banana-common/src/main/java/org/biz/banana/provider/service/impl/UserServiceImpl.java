package org.biz.banana.provider.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.biz.banana.bean.User;
import org.biz.banana.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Override
	public List<User> findList() {
		List<User> list = new ArrayList<User>();
		User user1 = new User(1L, "张三");
		User user2 = new User(2L, "李四");
		User user3 = new User(3L, "王五");
		list.add(user1);
		list.add(user2);
		list.add(user3);
		return list;
	}

}
