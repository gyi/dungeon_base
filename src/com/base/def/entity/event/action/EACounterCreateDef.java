package com.base.def.entity.event.action;

import com.base.def.entity.event.EventActionDef;
import com.base.pb.MsgDefineMap.EventActionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-8
 * @author : wangl
 * @Description : 创建计数器
 */
public class EACounterCreateDef implements EventActionDef {
	private static final long serialVersionUID = 6360533154678870313L;

	@Describle("计数器id")
	private int counterId;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_COUNTER_CREATE;
	}

	public int getCounterId() {
		return counterId;
	}

	public void setCounterId(int counterId) {
		this.counterId = counterId;
	}

}
