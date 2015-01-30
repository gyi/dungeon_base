package com.base.def.entity.event.action;

import com.base.def.entity.event.EventActionDef;
import com.base.pb.MsgDefineMap.EventActionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-11-27
 * @author : wangl
 * @Description : 地图动作：单位刷新
 */
public class EAMapUnitRefreshDef implements EventActionDef {
	private static final long serialVersionUID = 6118180281477850067L;
	@Describle("刷新id")
	private int refreshId;
	@Describle("阵营id")
	private int campId;

	@Override
	public EventActionType getType() {
		return EventActionType.EAT_UNIT_REFRESH;
	}

	public int getRefreshId() {
		return refreshId;
	}

	public void setRefreshId(int refreshId) {
		this.refreshId = refreshId;
	}

	public int getCampId() {
		return campId;
	}

	public void setCampId(int campId) {
		this.campId = campId;
	}

}
