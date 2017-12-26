package org.biz.banana.consumer;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 *BizBananaConsumerTest class
 *
 *@author zzx
 *@date 2017年12月26日 上午10:08:59
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:/config/*.xml")
public class BizBananaConsumerTest 
{
	@Test
	public void runTest() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
