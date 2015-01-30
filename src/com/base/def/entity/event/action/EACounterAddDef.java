package com.base.def.entity.event.action;

import com.base.pb.MsgDefineMap.EventActionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-8
 * @author : wangl
 * @Description : 计数器：值增加
 */
public class EACounterAddDef extends EACounterCreateDef {
	private static final long serialVersionUID = 6360533154678870313L;

	@Describle("值")
	private int value;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_COUNTER_ADD;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
