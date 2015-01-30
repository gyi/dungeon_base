package com.base.data;

import java.io.Serializable;

import com.core.general.RepeatSubmit;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @Create time : 2014-4-30
 * @author : wangl
 * @Description : 模块数据基类
 */
public abstract class ModuleData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1459952774659904745L;
	@JsonIgnore
	private RepeatSubmit saveSubmit = new RepeatSubmit();// 存储标记

	/**
	 * 模块类型
	 * 
	 * @return
	 */
	@JsonIgnore
	public abstract ModuleType moduleType();

	public RepeatSubmit getSaveSubmit() {
		return saveSubmit;
	}

}
