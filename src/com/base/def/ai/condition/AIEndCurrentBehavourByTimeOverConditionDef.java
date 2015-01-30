package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-15
 * @author : sunhua
 * @Description : ai行为超过时间终止当前行为(心跳)
 */
@Describle("ai超过时间结束行为条件")
public class AIEndCurrentBehavourByTimeOverConditionDef extends AIConditionDef {
	private static final long serialVersionUID = -3729574191100091190L;
	@Describle("达到多少时间终止当前行为")
	private long time;

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public AIConditionType getAIConditionType() {
		return null;
	}

}
