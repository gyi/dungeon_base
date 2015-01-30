package com.base.def.ai;

import java.io.Serializable;

import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-13
 * @author : sunhua
 * @Description : ai条件
 */
@Describle("ai条件")
public abstract class AIConditionDef implements Serializable {
	private static final long serialVersionUID = 6248359184505751886L;

	public abstract AIConditionType getAIConditionType();
}
