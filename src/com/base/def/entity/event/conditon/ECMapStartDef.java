package com.base.def.entity.event.conditon;

import com.base.def.entity.event.EventConditionDef;
import com.base.pb.MsgDefineMap.EventConditionType;

/**
 * 
 * @Create time : 2014-12-10
 * @author : wangl
 * @Description : 地图开始
 */
public class ECMapStartDef implements EventConditionDef {
	private static final long serialVersionUID = 7520942300729878481L;

	@Override
	public EventConditionType getType() {
		return EventConditionType.ECT_MAP_START;
	}

}
