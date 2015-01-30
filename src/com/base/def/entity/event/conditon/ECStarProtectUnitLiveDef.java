package com.base.def.entity.event.conditon;

import com.base.def.entity.event.EventConditionDef;
import com.base.pb.MsgDefineMap.EventConditionType;
import com.xe.annotation.Describle;

/**
 * @Create time : 2014-12-8
 * @author : sunhua
 * @Description : 保护单位条件
 */
public class ECStarProtectUnitLiveDef implements EventConditionDef {
	private static final long serialVersionUID = -9154273350359665144L;
	@Describle("保护单位的hp的百分比")
	private long unitDefId;
	@Describle("保护单位的血量百分比")
	private float protectUnitHpPercent;
	@Describle("自身的hp百分比(如果不需要填0)")
	private float selfHpPercent;

	public float getSelfHpPercent() {
		return selfHpPercent;
	}

	public long getUnitDefId() {
		return unitDefId;
	}

	public void setUnitDefId(long unitDefId) {
		this.unitDefId = unitDefId;
	}

	public float getProtectUnitHpPercent() {
		return protectUnitHpPercent;
	}

	public void setProtectUnitsHpPercent(float protectUnitHpPercent) {
		this.protectUnitHpPercent = protectUnitHpPercent;
	}

	public void setSelfHpPercent(float selfHpPercent) {
		this.selfHpPercent = selfHpPercent;
	}

	@Override
	public EventConditionType getType() {
		return EventConditionType.ECT_PROTECTUNIT_LIVE;
	}

}
