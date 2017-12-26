package org.biz.banana.provider.service;

import com.appleframework.model.Dto;

/**
 * 
 *BaseServiceDispose class
 *
 *@author zzx
 *@date 2017年12月26日 上午10:08:11
 */
public interface BaseServiceDispose {
	
	/**
	 * 处理kafka中数据
	 * @param dto
	 * @return Dto
	 */
	public Dto dispose(Dto dto);
}
