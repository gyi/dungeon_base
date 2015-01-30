package com.base.def.entity.event;

import java.io.Serializable;

import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-11-27
 * @author : wangl
 * @Description : 事件配置
 */
public class EventDef implements Serializable {
	private static final long serialVersionUID = 2980338456767127132L;
	@Describle("事件条件")
	private EventConditionDef ecInter;
	@Describle("事件类型")
	private EventActionDef[] eaInters = new EventActionDef[0];

	public EventConditionDef getEcInter() {
		return ecInter;
	}

	public void setEcInter(EventConditionDef ecInter) {
		this.ecInter = ecInter;
	}

	public EventActionDef[] getEaInters() {
		return eaInters;
	}

	public void setEaInters(EventActionDef[] eaInters) {
		this.eaInters = eaInters;
	}

}
