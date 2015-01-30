package com.base.def.entity.event.conditon;

import com.base.def.entity.event.EventConditionDef;
import com.base.pb.MsgDefineMap.EventConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-9
 * @author : wangl
 * @Description : 计数器：计数检测
 */
public class ECCounterCheckDef implements EventConditionDef {
	private static final long serialVersionUID = 5137784670262985026L;

	@Describle("计数器id")
	private int counterId;

	@Override
	public EventConditionType getType() {
		return EventConditionType.ECT_COUNTER_CHECK;
	}

	public int getCounterId() {
		return counterId;
	}

	public void setCounterId(int counterId) {
		this.counterId = counterId;
	}

}
