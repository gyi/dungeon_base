package com.base.def.entity.event.action;

import com.base.pb.MsgDefineMap.EventActionType;

/**
 * 
 * @Create time : 2014-12-8
 * @author : wangl
 * @Description : 计数器：值减少
 */
public class EACounterReduceDef extends EACounterAddDef {
	private static final long serialVersionUID = 6360533154678870313L;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_COUNTER_REDUCE;
	}

}
