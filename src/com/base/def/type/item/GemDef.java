package com.base.def.type.item;

import com.base.def.type.abs.ItemDef;
import com.base.pb.MsgDefineItem.ItemType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-2
 * @author : sunhua
 * @Description : TODO
 */
@Describle("宝石配置表")
public class GemDef extends ItemDef {
	private static final long serialVersionUID = 5645068403520789694L;
	@Describle("宝石等级")
	private int grade;
	@Describle("宝石类型")
	private int GemType;
	@Describle("宝石属性值")
	private int numValue;
	@Describle("宝石属性百分比(万为分母)")
	private float gemPercent;

	@Override
	public int getType() {
		return ItemType.GEM_ITEM_VALUE;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGemType() {
		return GemType;
	}

	public void setGemType(int gemType) {
		GemType = gemType;
	}

	public int getNumValue() {
		return numValue;
	}

	public void setNumValue(int numValue) {
		this.numValue = numValue;
	}

	public float getGemPercent() {
		return gemPercent;
	}

	public void setGemPercent(float gemPercent) {
		this.gemPercent = gemPercent;
	}

}
