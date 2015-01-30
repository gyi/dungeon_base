package com.base.def.entity.event.action;

import com.base.pb.MsgDefineMap.EventActionType;

/**
 * 
 * @Create time : 2014-12-8
 * @author : wangl
 * @Description : 暂停计时器
 */
public class EACountDownPauseDef extends EACountDownCreateDef {
	private static final long serialVersionUID = 3013098572903367084L;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_COUNTDOWN_PAUSE;
	}

}
