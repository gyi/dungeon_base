package com.base.def.entity.event.action;

import com.base.pb.MsgDefineMap.EventActionType;

/**
 * 
 * @Create time : 2014-12-8
 * @author : wangl
 * @Description : 重置计数器
 */
public class EACounterResetDef extends EACounterCreateDef {
	private static final long serialVersionUID = 6360533154678870313L;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_COUNTER_RESET;
	}

}
