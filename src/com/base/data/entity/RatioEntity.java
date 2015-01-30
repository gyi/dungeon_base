package com.base.data.entity;

import com.core.general.RatioHelper.Ratio;

/**
 * 
 * @Create time : 2015-1-13
 * @author : sunhua
 * @Description : 概率结构体
 */
public class RatioEntity implements Ratio {
	private static final long serialVersionUID = -5498772024420829169L;
	private int key;
	private int radio;

	public RatioEntity() {

	}

	public RatioEntity(int key, int radio) {
		this.key = key;
		this.radio = radio;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public int getRatio() {
		return this.radio;
	}

	@Override
	public String toString() {
		return "RatioEntity [key=" + key + ", radio=" + radio + "]";
	}

}
