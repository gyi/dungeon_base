package com.base.def.entity;

import java.io.Serializable;

import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-11-10
 * @author : wangl
 * @Description : TODO
 */
public class Point3Def implements Serializable {
	private static final long serialVersionUID = 9058612965949314979L;
	@Describle("x")
	private int x;
	@Describle("y")
	private int y;
	@Describle("z")
	private int z;

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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
