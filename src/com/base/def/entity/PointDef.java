package com.base.def.entity;

import java.io.Serializable;

import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-6-6
 * @author : wangl
 * @Description : 点配置
 */
public class PointDef implements Serializable {
	private static final long serialVersionUID = 2735826771963829660L;
	@Describle("x")
	private int x;
	@Describle("y")
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
