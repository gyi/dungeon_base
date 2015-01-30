package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-11
 * @author : sunhua
 * @Description : 达到某个时间时间条件(心跳)
 */
@Describle("ai距离开始行为的时间超过指定值条件")
public class AIOverTimerConditionDef extends AIConditionDef {
	private static final long serialVersionUID = 8705396942146916811L;
	@Describle("时间条件")
	private long time;

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.TIMER_OVER;
	}

}
