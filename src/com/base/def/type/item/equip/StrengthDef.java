package com.base.def.type.item.equip;

import java.util.HashMap;
import java.util.Map;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.core.general.StringHelper;
import com.xe.annotation.Describle;

@Describle("强化表")
public class StrengthDef implements BaseDef<String> {
	private static final long serialVersionUID = -2474978948989322935L;
	@Describle("部位")
	private int part;
	@Describle("强化等级")
	private int strengthLevel;
	@Describle("强化成功率(分母10000)")
	private int strengthOdds;
	@Describle("单位时间增加成功率(分母10000,单位:分钟)")
	private int addOdds;
	@Describle("间隔单位时间:分钟")
	private int minus;
	@Describle("花费金币数量")
	private int cost;
	@Describle("强化星级限制(1:30;2:10)1级:A星级数量;2:A星级数量")
	private Map<Integer, Integer> levelLimit;
	@Describle("强化等级系数(分母10000)")
	private int levelCf;

	public void setPart(int part) {
		this.part = part;
	}

	public int getAddOdds() {
		return addOdds;
	}

	public void setAddOdds(int addOdds) {
		this.addOdds = addOdds;
	}

	public int getStrengthOdds() {
		return strengthOdds;
	}

	public void setStrengthOdds(int strengthOdds) {
		this.strengthOdds = strengthOdds;
	}

	public int getMinus() {
		return minus;
	}

	public void setMinus(int minus) {
		this.minus = minus;
	}

	public Map<Integer, Integer> getLevelLimit() {
		return levelLimit;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setLevelLimit(String levelLimit) {
		if ("".equals(levelLimit) || levelLimit == null) {
			return;
		}
		this.levelLimit = new HashMap<Integer, Integer>();
		String[] strs = levelLimit.split(StringHelper.leve2split);
		for (String str : strs) {
			int[] arr = StringHelper.toIntArray(StringHelper.leve4split, str);
			this.levelLimit.put(arr[0], arr[1]);
		}
	}

	public int getStrengthLevel() {
		return strengthLevel;
	}

	public void setStrengthLevel(int strengthLevel) {
		this.strengthLevel = strengthLevel;
	}

	public int getLevelCf() {
		return levelCf;
	}

	public void setLevelCf(int levelCf) {
		this.levelCf = levelCf;
	}

	@Override
	public DefType getDefType() {
		return DefType.STRENGTH;
	}

	@Override
	public String getId() {
		return StringHelper.buildKey(part, strengthLevel);
	}

}
