package com.base.def.ai.relation;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-26
 * @author : sunhua
 * @Description : 与条件关系
 */
@Describle("与条件关系")
public class AndRelationDef extends AIConditionDef {
	private static final long serialVersionUID = -164633462894204068L;
	@Describle("条件一")
	private AIConditionDef conditionDef_One;
	@Describle("条件二")
	private AIConditionDef conditionDef_Two;

	public AIConditionDef getConditionDef_One() {
		return conditionDef_One;
	}

	public void setConditionDef_One(AIConditionDef conditionDef_One) {
		this.conditionDef_One = conditionDef_One;
	}

	public AIConditionDef getConditionDef_Two() {
		return conditionDef_Two;
	}

	public void setConditionDef_Two(AIConditionDef conditionDef_Two) {
		this.conditionDef_Two = conditionDef_Two;
	}

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.AND_RELATION;
	}

}
