package com.base.data.module;

import com.base.data.ModuleData;
import com.base.data.ModuleType;

/**
 * 
 * @Create time : 2014-5-28
 * @author : wangl
 * @Description : 角色属性数据
 */
public class PropertyData extends ModuleData {
	private static final long serialVersionUID = -6791412871977489607L;
	private int career;// 职业
	private int level = 1;// 等级
	private int exp = 0;// 经验值
	private int fighting = 0;// 战斗力

	@Override
	public ModuleType moduleType() {
		return ModuleType.property;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getFighting() {
		return fighting;
	}

	public void setFighting(int fighting) {
		this.fighting = fighting;
	}

}
