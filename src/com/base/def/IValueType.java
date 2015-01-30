package com.base.def;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @Create time : 2014-4-23
 * @author : wangl
 * @Description : 字段值类型注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IValueType {

	/**
	 * 值类型
	 * 
	 * @return
	 */
	ValueType value();

}
