package com.base.def.entity.event.action;

import com.base.def.entity.event.EventActionDef;
import com.base.pb.MsgDefineMap.EventActionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-1
 * @author : wangl
 * @Description : 打开事件的动作
 */
public class EAEventOpenDef implements EventActionDef {
	private static final long serialVersionUID = -2294493316927368602L;

	@Describle("事件id")
	private int[] eventIds;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_EVENT_OPEN;
	}

	public int[] getEventIds() {
		return eventIds;
	}

	public void setEventIds(int[] eventIds) {
		this.eventIds = eventIds;
	}

}
