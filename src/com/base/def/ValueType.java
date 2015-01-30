package com.base.def;

import com.core.general.StringHelper;

/**
 * 
 * @Create 2013-12-31
 * @author wangl
 * @Description
 */
public enum ValueType {

	INT, FLOAT, LONG, STRING, BOOL, INT_ARRAY, FLOAT_ARRAY, LONG_ARRAY, STRING_ARRAY;

	/**
	 * 转换value值
	 * 
	 * @param type
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static <T> Object parse(ValueType type, String value) throws Exception {
		switch (type) {
		case INT:
			return Integer.valueOf(value);
		case FLOAT:
			return Float.valueOf(value);
		case LONG:
			return Long.valueOf(value);
		case STRING:
			return value;
		case BOOL:
			return Boolean.valueOf(value);
		case INT_ARRAY:
			return StringHelper.toIntArray(StringHelper.findSplit(value), value);
		case FLOAT_ARRAY:
			return StringHelper.toFloatArray(StringHelper.findSplit(value), value);
		case LONG_ARRAY:
			return StringHelper.toLongArray(StringHelper.findSplit(value), value);
		case STRING_ARRAY:
			return value.split(StringHelper.findSplit(value));
		default:
			break;
		}
		return null;
	}

}
