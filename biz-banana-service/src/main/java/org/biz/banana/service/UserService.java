package org.biz.banana.service;

import java.util.List;

import org.biz.banana.bean.User;

/**
 * 
 *UserService class
 *
 *@author zzx
 *@date 2017年12月26日 上午10:09:25
 */
public interface UserService 
{
	/**
	 * 查找用户信息
	 * @return
	 */
	public List<User> findList();
	
	/**
	 * 添加用户信息
	 */
	public void addUser();
}
