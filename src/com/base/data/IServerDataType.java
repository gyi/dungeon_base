package com.base.data;

import com.fasterxml.jackson.databind.JavaType;

/**
 * 
 * @Create time : 2014-9-17
 * @author : wangl
 * @Description : 服务器数据类型
 */
public interface IServerDataType {

	/**
	 * 获取数据对应的javaType
	 * 
	 * @return
	 */
	public JavaType getDataType();

	/**
	 * 类型名称
	 * 
	 * @return
	 */
	public String name();

}
