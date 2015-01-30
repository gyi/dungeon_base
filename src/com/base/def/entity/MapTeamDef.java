package com.base.def.entity;

import java.io.Serializable;

import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-2
 * @author : wangl
 * @Description : 地图中玩家队伍配置
 */
public class MapTeamDef implements Serializable {
	private static final long serialVersionUID = 3036249677159755705L;

	@Describle("阵营")
	private int campId;
	@Describle("出生区域")
	private int brithAreaId;
	@Describle("复活区域")
	private int reviveAreaId;

	public int getCampId() {
		return campId;
	}

	public void setCampId(int campId) {
		this.campId = campId;
	}

	public int getBrithAreaId() {
		return brithAreaId;
	}

	public void setBrithAreaId(int brithAreaId) {
		this.brithAreaId = brithAreaId;
	}

	public int getReviveAreaId() {
		return reviveAreaId;
	}

	public void setReviveAreaId(int reviveAreaId) {
		this.reviveAreaId = reviveAreaId;
	}

}
