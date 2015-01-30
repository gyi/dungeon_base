package com.base.def.entity;

import java.io.Serializable;

import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-6-16
 * @author : wangl
 * @Description : 范围值，[下限-上限]
 */
public class RangeValue implements Serializable {
	private static final long serialVersionUID = -4816256336327312573L;
	@Describle("下限")
	public int min;
	@Describle("上限")
	public int max;

	public static RangeValue valueOf(String valueString) {
		String[] valueStrs = valueString.split(StringHelper.leve3split);
		if (valueStrs.length == 1) {
			return valueOf(Integer.valueOf(valueStrs[0]));
		} else if (valueStrs.length == 2) {
			return valueOf(Integer.valueOf(valueStrs[0]), Integer.valueOf(valueStrs[1]));
		} else {
			throw new RuntimeException("error valueString = " + valueString);
		}
	}

	public static RangeValue valueOf(int value) {
		RangeValue rangeValue = new RangeValue();
		rangeValue.min = rangeValue.max = value;
		return rangeValue;
	}

	public static RangeValue valueOf(RangeValue rangeValue) {
		if (rangeValue == null) {
			return new RangeValue();
		}
		return valueOf(rangeValue.min, rangeValue.max);
	}

	public static RangeValue valueOf(int min, int max) {
		RangeValue rangeValue = new RangeValue();
		rangeValue.min = min;
		rangeValue.max = max;
		return rangeValue;
	}

	/**
	 * 获取rangevalue的值，如果是null，返回0
	 * 
	 * @param rangeValue
	 * @return
	 */
	public static int toInt(RangeValue rangeValue) {
		if (rangeValue == null) {
			return 0;
		} else {
			return rangeValue.max;
		}
	}

	/**
	 * 加法
	 * 
	 * @param other
	 */
	public RangeValue add(RangeValue other) {
		if (other != null) {
			this.min += other.min;
			this.max += other.max;
		}
		return this;
	}

	/**
	 * 加法
	 * 
	 * @param other
	 */
	public RangeValue add(int value) {
		this.min += value;
		this.max += value;
		return this;
	}

	/**
	 * 乘法
	 * 
	 * @param value
	 * @return
	 */
	public RangeValue multiply(float value) {
		this.min *= value;
		this.max *= value;
		return this;

	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
}
