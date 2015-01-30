package com.base.data.entity;

import java.io.Serializable;

/**
 * 
 * @Create time : 2015-1-23
 * @author : wangl
 * @Description : 地图历史记录
 */
public class DungeonHistory implements Serializable {
	private static final long serialVersionUID = 8007475524756176559L;

	private int starLevel;// 星级
	private int useTimes;// 已用次数
	private int buyTimes;// 购买次数

	public int getStarLevel() {
		return starLevel;
	}

	public void setStarLevel(int starLevel) {
		this.starLevel = starLevel;
	}

	public int getUseTimes() {
		return useTimes;
	}

	public void setUseTimes(int useTimes) {
		this.useTimes = useTimes;
	}

	public int getBuyTimes() {
		return buyTimes;
	}

	public void setBuyTimes(int buyTimes) {
		this.buyTimes = buyTimes;
	}

}
