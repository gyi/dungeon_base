package com.base.def.entity.event.conditon;

import com.base.def.entity.event.EventConditionDef;
import com.base.pb.MsgDefineMap.EventConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-5
 * @author : wangl
 * @Description : 倒计时结束
 */
public class ECCountDownFinishDef implements EventConditionDef {
	private static final long serialVersionUID = -1852636618115143742L;

	@Describle("计时器id")
	private int countDownId;

	@Override
	public EventConditionType getType() {
		return EventConditionType.ECT_COUNTDOWN_FINISH;
	}

	public int getCountDownId() {
		return countDownId;
	}

	public void setCountDownId(int countDownId) {
		this.countDownId = countDownId;
	}

}
