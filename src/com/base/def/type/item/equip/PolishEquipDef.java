package com.base.def.type.item.equip;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2015-1-9
 * @author : sunhua
 * @Description : 装备洗练配置
 */
@Describle("装备洗练配置表")
public class PolishEquipDef implements BaseDef<String> {
	private static final long serialVersionUID = -8995858781443547534L;
	@Describle("装备id")
	private int equipId;
	@Describle("属性property")
	private int property;
	@Describle("金币洗练区间最小值")
	private int goldPolishMin;
	@Describle("金币洗练区间最大值")
	private int goldPolishMax;
	@Describle("元宝洗练区间最小值")
	private int syceePolishMin;
	@Describle("元宝洗练区间最大值")
	private int syceePolishMax;

	public int getGoldPolishMin() {
		return goldPolishMin;
	}

	public void setGoldPolishMin(int goldPolishMin) {
		this.goldPolishMin = goldPolishMin;
	}

	public int getGoldPolishMax() {
		return goldPolishMax;
	}

	public void setGoldPolishMax(int goldPolishMax) {
		this.goldPolishMax = goldPolishMax;
	}

	public int getSyceePolishMin() {
		return syceePolishMin;
	}

	public void setSyceePolishMin(int syceePolishMin) {
		this.syceePolishMin = syceePolishMin;
	}

	public void setProperty(int property) {
		this.property = property;
	}

	public int getEquipId() {
		return equipId;
	}

	public void setEquipId(int equipId) {
		this.equipId = equipId;
	}

	public int getProperty() {
		return property;
	}

	public int getSyceePolishMax() {
		return syceePolishMax;
	}

	public void setSyceePolishMax(int syceePolishMax) {
		this.syceePolishMax = syceePolishMax;
	}

	@Override
	public String getId() {
		return StringHelper.buildKey(equipId, property);
	}

	@Override
	public DefType getDefType() {
		return DefType.EQUIP_POLISH;
	}

}
