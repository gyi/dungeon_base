package com.base.data.entity;

import java.io.Serializable;

/**
 * 属性值结构体
 * 
 * @Create time : 2014-9-24
 * @author : sunhua
 * @Description : TODO
 */
public class PropertyValue implements Serializable {

	private static final long serialVersionUID = -2393937330260723207L;
	private int property;
	private int value;

	public PropertyValue() {
	}

	public PropertyValue(int property, int value) {
		this.property = property;
		this.value = value;
	}

	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
