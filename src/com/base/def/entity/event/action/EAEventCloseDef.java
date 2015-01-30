package com.base.def.entity.event.action;

import com.base.pb.MsgDefineMap.EventActionType;

/**
 * 
 * @Create time : 2014-12-1
 * @author : wangl
 * @Description : 关闭事件的动作
 */
public class EAEventCloseDef extends EAEventOpenDef {
	private static final long serialVersionUID = -5704835347090183836L;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_EVENT_CLOSE;
	}

}
