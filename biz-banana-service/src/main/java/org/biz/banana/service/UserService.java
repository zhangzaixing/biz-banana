package org.biz.banana.service;

import java.util.List;

import org.biz.banana.bean.User;

/**
 * Hello world!
 *
 */
public interface UserService 
{
	/**
	 *查找用户信息 
	 */
	public List<User> findList();
}
