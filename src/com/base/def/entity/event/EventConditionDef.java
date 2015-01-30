package com.base.def.entity.event;

import java.io.Serializable;

import com.base.pb.MsgDefineMap.EventConditionType;

/**
 * 
 * @Create time : 2014-11-27
 * @author : wangl
 * @Description : 事件条件配置接口
 */
public interface EventConditionDef extends Serializable {

	/**
	 * 事件条件类型
	 * 
	 * @return
	 */
	public EventConditionType getType();

}
