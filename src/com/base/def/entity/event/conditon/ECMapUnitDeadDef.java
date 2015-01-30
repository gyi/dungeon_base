package com.base.def.entity.event.conditon;

import com.base.def.entity.event.EventConditionDef;
import com.base.pb.MsgDefineMap.EventConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-11-27
 * @author : wangl
 * @Description : 事件条件：指定type、id的单位死亡
 */
public class ECMapUnitDeadDef implements EventConditionDef {
	private static final long serialVersionUID = 284768334650314159L;

	@Describle("单位类型")
	private int unitType;
	@Describle("单位id(如果id为0，则表示接受该类型的所有单位)")
	private long unitId;

	@Override
	public EventConditionType getType() {
		return EventConditionType.ECT_UNIT_DEAD;
	}

	public int getUnitType() {
		return unitType;
	}

	public void setUnitType(int unitType) {
		this.unitType = unitType;
	}

	public long getUnitId() {
		return unitId;
	}

	public void setUnitId(long unitId) {
		this.unitId = unitId;
	}

}
