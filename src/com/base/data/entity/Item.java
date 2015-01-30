package com.base.data.entity;

import java.io.Serializable;

/**
 * 
 * @Create time : 2015-1-4
 * @author : sunhua
 * @Description : 道具
 */
public class Item implements Serializable {

	private static final long serialVersionUID = -909778730043091792L;
	private int defId;// 配置id
	private int num;// 道具数量
	private long getTime;// 获得时间

	public int getDefId() {
		return defId;
	}

	public void setDefId(int defId) {
		this.defId = defId;
	}

	public long getGetTime() {
		return getTime;
	}

	public void setGetTime(long getTime) {
		this.getTime = getTime;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
