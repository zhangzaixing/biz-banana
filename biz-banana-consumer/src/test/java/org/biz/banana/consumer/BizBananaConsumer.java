package org.biz.banana.consumer;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:/config/*.xml")
public class BizBananaConsumer 
{
	@Test
	public void RunTest() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
