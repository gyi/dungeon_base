package com.base.def;

/**
 * 
 * @Create time : 2014-7-31
 * @author : wangl
 * @Description : 资源reload接口
 */
public interface IReload {

	/**
	 * 加载结束
	 */
	public void afterLoadOver();

	/**
	 * 资源被reload后触发
	 */
	public void afterReload();

}
