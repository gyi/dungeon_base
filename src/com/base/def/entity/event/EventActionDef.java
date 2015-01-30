package com.base.def.entity.event;

import java.io.Serializable;

import com.base.pb.MsgDefineMap.EventActionType;

/**
 * 
 * @Create time : 2014-11-27
 * @author : wangl
 * @Description : 事件动作配置接口
 */
public interface EventActionDef extends Serializable {

	/**
	 * 事件动作类型
	 * 
	 * @return
	 */
	public EventActionType getType();

}
