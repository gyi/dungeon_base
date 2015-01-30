package com.base.def.entity;

import java.io.Serializable;

import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-11-27
 * @author : wangl
 * @Description : 掉落配置
 */
public class DropDef implements Serializable {
	private static final long serialVersionUID = 7311921084419532042L;

	@Describle("小怪掉落")
	private int[] creepsDrops;
	@Describle("星级经验")
	private int[] exps;
	@Describle("星级金币")
	private int[] golds;
	@Describle("通关星级奖励")
	private int[] starRewards;

	public int[] getExps() {
		return exps;
	}

	public void setExps(int[] exps) {
		this.exps = exps;
	}

	public int[] getCreepsDrops() {
		return creepsDrops;
	}

	public void setCreepsDrops(int[] creepsDrops) {
		this.creepsDrops = creepsDrops;
	}

	public int[] getStarRewards() {
		return starRewards;
	}

	public void setStarRewards(int[] starRewards) {
		this.starRewards = starRewards;

		if (starRewards.length != 5) {
			throw new ArrayIndexOutOfBoundsException("starRewards size must == 5");
		}
	}

	public int[] getGolds() {
		return golds;
	}

	public void setGolds(int[] golds) {
		this.golds = golds;
	}

}
