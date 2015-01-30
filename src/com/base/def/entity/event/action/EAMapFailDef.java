package com.base.def.entity.event.action;

import com.base.def.entity.event.EventActionDef;
import com.base.pb.MsgDefineMap.EventActionType;

/**
 * 
 * @Create time : 2014-12-5
 * @author : wangl
 * @Description : 地图失败
 */
public class EAMapFailDef implements EventActionDef {
	private static final long serialVersionUID = 5481290814380678598L;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_MAP_FAIL;
	}

}
