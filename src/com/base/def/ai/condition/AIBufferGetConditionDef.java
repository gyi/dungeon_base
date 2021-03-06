package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-11
 * @author : sunhua
 * @Description : 获得buffer条件(触发)
 */
@Describle("ai获得buffer条件")
public class AIBufferGetConditionDef extends AIConditionDef {
	private static final long serialVersionUID = -3132795785574078616L;
	@Describle("bufferId条件")
	private int bufferId;

	public int getBufferId() {
		return bufferId;
	}

	public void setBufferId(int bufferId) {
		this.bufferId = bufferId;
	}

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.BUFFER_GET;
	}
}
