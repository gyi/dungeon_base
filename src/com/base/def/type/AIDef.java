package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.base.def.ai.AIBehavourDef;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-13
 * @author : sunhua
 * @Description : ai配置
 */
@Describle("AI配置")
public class AIDef implements BaseDef<Integer> {
	private static final long serialVersionUID = -1905337638124640457L;
	@Describle("配置id")
	private int id;
	@Describle("ai行为配置")
	private AIBehavourDef[] aiBehavourDefs;

	public AIBehavourDef[] getAiBehavourDefs() {
		return aiBehavourDefs;
	}

	public void setAiBehavourDefs(AIBehavourDef[] aiBehavourDefs) {
		this.aiBehavourDefs = aiBehavourDefs;
	}

	@Override
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public DefType getDefType() {
		return DefType.AI;
	}
}
