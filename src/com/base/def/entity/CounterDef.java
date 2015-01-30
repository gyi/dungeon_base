package com.base.def.entity;

import java.io.Serializable;

import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-9
 * @author : wangl
 * @Description : 计数器
 */
public class CounterDef implements Serializable {
	private static final long serialVersionUID = -6918824999449369092L;

	@Describle("值检测关系")
	private int vct;
	@Describle("默认值")
	private int defaultValue;
	@Describle("目标值")
	private int targetValue;

	public int getVct() {
		return vct;
	}

	public void setVct(int vct) {
		this.vct = vct;
	}

	public int getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(int defaultValue) {
		this.defaultValue = defaultValue;
	}

	public int getTargetValue() {
		return targetValue;
	}

	public void setTargetValue(int targetValue) {
		this.targetValue = targetValue;
	}

}
