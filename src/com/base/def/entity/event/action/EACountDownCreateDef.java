package com.base.def.entity.event.action;

import com.base.def.entity.event.EventActionDef;
import com.base.pb.MsgDefineMap.EventActionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-8
 * @author : wangl
 * @Description : 创建一个定时器
 */
public class EACountDownCreateDef implements EventActionDef {
	private static final long serialVersionUID = 6360533154678870313L;

	@Describle("定时器id")
	private int countDownId;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_COUNTDOWN_CREATE;
	}

	public int getCountDownId() {
		return countDownId;
	}

	public void setCountDownId(int countDownId) {
		this.countDownId = countDownId;
	}

}
