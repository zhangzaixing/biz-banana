package org.biz.banana.provider.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.biz.banana.bean.User;
import org.biz.banana.service.UserService;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private TaskExecutor TaskExecutor;
	
	@Override
	public List<User> findList() {
		List<User> list = new ArrayList<User>();
		for (int i = 1; i <= 100; i++) {
			list.add(new User(i, "zzx-demo-" + i, i));
		}
		return list;
	}
	
	@Override
	public void addUser() {
		Long startTime = System.currentTimeMillis();
		System.out.println("开始");
		AsynThreadTest test = new AsynThreadTest();
		TaskExecutor.execute(test);
		System.out.println("结束耗时：" + (System.currentTimeMillis() - startTime));
	}

	class AsynThreadTest implements Runnable {
		public void run() {
			try {
				Thread.sleep(10000L);
				System.out.println("11111");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
