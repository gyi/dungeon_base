package com.base.def.entity.event.action;

import com.base.pb.MsgDefineMap.EventActionType;

/**
 * 
 * @Create time : 2014-12-8
 * @author : wangl
 * @Description : 恢复被暂停的计时器
 */
public class EACountDownContinueDef extends EACountDownCreateDef {
	private static final long serialVersionUID = 3013098572903367084L;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_COUNTDOWN_CONTINUE;
	}

}
