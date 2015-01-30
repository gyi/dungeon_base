package com.base.def.type.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.base.data.entity.RatioEntity;
import com.base.def.type.abs.ItemDef;
import com.base.pb.MsgDefineItem.ItemType;
import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2015-1-4
 * @author : sunhua
 * @Description : 装备配置表
 */
@Describle("装备表")
public class EquipDef extends ItemDef {
	private static final long serialVersionUID = 4069231761648799646L;
	@Describle("装备部位")
	private int part;
	@Describle("基础属性值")
	private Map<Integer, Integer> basicPropertys;
	@Describle("需求的合成材料(id:数量;id:数量)")
	private Map<Integer, Integer> materialMap;
	@Describle("合成之后的装备id")
	private int nextId;
	@Describle("合成该装备需要消耗金币数量")
	private int compoundNeedGold;
	@Describle("可洗出属性集合随机方式(属性:概率;属性:概率)分母10000")
	private List<RatioEntity> propertyOdds;
	@Describle("强化基础属性值")
	private Map<Integer, Integer> strengthBasicPropertys;

	public int getPart() {
		return part;
	}

	public void setPart(int part) {
		this.part = part;
	}

	public Map<Integer, Integer> getBasicPropertys() {
		return basicPropertys;
	}

	public void setBasicPropertys(String basicPropertys) {
		if ("".equals(basicPropertys) || basicPropertys == null) {
			return;
		}
		this.basicPropertys = new HashMap<Integer, Integer>();
		String[] strs = basicPropertys.split(StringHelper.leve2split);
		for (String str : strs) {
			int[] arr = StringHelper.toIntArray(StringHelper.leve4split, str);
			this.basicPropertys.put(arr[0], arr[1]);
		}
	}

	public Map<Integer, Integer> getStrengthBasicPropertys() {
		return strengthBasicPropertys;
	}

	public void setStrengthBasicPropertys(String strengthBasicPropertys) {
		if ("".equals(strengthBasicPropertys) || strengthBasicPropertys == null) {
			return;
		}
		this.strengthBasicPropertys = new HashMap<Integer, Integer>();
		String[] strs = strengthBasicPropertys.split(StringHelper.leve2split);
		for (String str : strs) {
			int[] arr = StringHelper.toIntArray(StringHelper.leve4split, str);
			this.strengthBasicPropertys.put(arr[0], arr[1]);
		}
	}

	public Map<Integer, Integer> getMaterialMap() {
		return materialMap;
	}

	public void setMaterialMap(String materialMap) {
		if ("".equals(materialMap) || materialMap == null) {
			return;
		}
		this.materialMap = new HashMap<Integer, Integer>();
		String[] strs = materialMap.split(StringHelper.leve2split);
		for (String str : strs) {
			int[] arr = StringHelper.toIntArray(StringHelper.leve4split, str);
			this.materialMap.put(arr[0], arr[1]);
		}
	}

	public int getNextId() {
		return nextId;
	}

	public void setNextId(int nextId) {
		this.nextId = nextId;
	}

	public int getCompoundNeedGold() {
		return compoundNeedGold;
	}

	public void setCompoundNeedGold(int compoundNeedGold) {
		this.compoundNeedGold = compoundNeedGold;
	}

	public List<RatioEntity> getPropertyOdds() {
		return propertyOdds;
	}

	public void setPropertyOdds(String propertyOdds) {
		if (propertyOdds == null || "".equals(propertyOdds)) {
			return;
		}
		this.propertyOdds = new ArrayList<>();
		String[] strs = propertyOdds.split(StringHelper.leve2split);
		for (String str : strs) {
			int[] arr = StringHelper.toIntArray(StringHelper.leve4split, str);
			RatioEntity ratioEntity = new RatioEntity(arr[0], arr[1]);
			this.propertyOdds.add(ratioEntity);
		}
	}

	@Override
	public int getType() {
		return ItemType.EQUIP_ITEM_VALUE;
	}

}
