package com.base.def.entity.event.action;

import com.base.def.entity.event.EventActionDef;
import com.base.pb.MsgDefineMap.EventActionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-5
 * @author : sunhua
 * @Description : 加星事件
 */
public class EAStarAddDef implements EventActionDef {
	private static final long serialVersionUID = -559026086638516004L;
	@Describle("增加星级")
	private int starLevel;

	public int getStarLevel() {
		return starLevel;
	}

	public void setStarLevel(int starLevel) {
		this.starLevel = starLevel;
	}

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_STAR_ADD;
	}

}
