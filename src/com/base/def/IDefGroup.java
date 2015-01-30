package com.base.def;

/**
 * 
 * @Create time : 2014-10-10
 * @author : wangl
 * @Description : 配置分组接口
 */
public interface IDefGroup<Def extends BaseDef<?>> {

	/**
	 * 是否符合需求
	 * 
	 * @return
	 * @throws Exception
	 */
	public boolean isPass(Def def) throws Exception;

	/**
	 * 该比较器的key
	 * 
	 * @return
	 */
	public String getKey();

}
