package com.base.data.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.base.def.DefFactory;
import com.base.def.DefType;
import com.base.def.type.item.equip.StrengthDef;
import com.core.general.StringHelper;

/**
 * 
 * @Create time : 2015-1-7
 * @author : sunhua
 * @Description : 角色部位
 */
public class RolePart implements Serializable {
	private static final long serialVersionUID = 5847398063996498909L;
	private int part;
	private int strengthLevel;
	private int successOdd;// 分母10000
	private long counterStartTime;
	private Item item;// 部位上的道具
	private float x1 = 0.01F;
	private float x2 = 0.01F;
	private float cacheC;
	// 位置属性键值对
	private final Map<Integer, PropertyValue> attributeCache = new HashMap<Integer, PropertyValue>();

	public RolePart() {
	}

	public RolePart(Item item, long counterStartTime, int part) {
		super();
		this.item = item;
		this.counterStartTime = counterStartTime;
		this.part = part;
		StrengthDef strengthDef = DefFactory.instance().getDef(DefType.STRENGTH,
				StringHelper.buildKey(part, strengthLevel));
		this.successOdd = strengthDef.getStrengthOdds();// 初始化成功率
	}

	public int getStrengthLevel() {
		return strengthLevel;
	}

	public void setStrengthLevel(int strengthLevel) {
		this.strengthLevel = strengthLevel;
	}

	public int getSuccessOdd() {
		return successOdd;
	}

	public void setSuccessOdd(int successOdd) {
		this.successOdd = successOdd;
	}

	public long getCounterStartTime() {
		return counterStartTime;
	}

	public void setCounterStartTime(long counterStartTime) {
		this.counterStartTime = counterStartTime;
	}

	public Item getItem() {
		return item;
	}

	public int getPart() {
		return part;
	}

	public Map<Integer, PropertyValue> getAttributeCache() {
		return attributeCache;
	}

	public void setPart(int part) {
		this.part = part;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public float getX1() {
		return x1;
	}

	public void setX1(float x1) {
		this.x1 = x1;
	}

	public float getCacheC() {
		return cacheC;
	}

	public void setCacheC(float cacheC) {
		this.cacheC = cacheC;
	}

	public float getX2() {
		return x2;
	}

	public void setX2(float x2) {
		this.x2 = x2;
	}
}
