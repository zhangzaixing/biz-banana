package org.biz.banana.provider;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.biz.banana.bean.User;
import org.biz.banana.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 *BizBananaTest class
 *
 *@author zzx
 *@date 2017年12月26日 上午10:09:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config/*.xml"})
public class BizBananaTest {
	
	@Resource
	private  UserService userService;
	
	/**
	 * 
	 */
	@Test
	public void start() {
		try {
			
			//userService.addUser();
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

