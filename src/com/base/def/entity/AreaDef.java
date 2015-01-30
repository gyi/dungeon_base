package com.base.def.entity;

import java.io.Serializable;

import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-7-10
 * @author : zhaowei
 * @Description : TODO 区域配置表
 */
public class AreaDef implements Serializable {
	private static final long serialVersionUID = -168560348415366154L;
	@Describle("区域点集合")
	private PointDef[] pointDefs;

	public PointDef[] getPointDefs() {
		return pointDefs;
	}

	public void setPointDefs(PointDef[] pointDefs) {
		this.pointDefs = pointDefs;
	}

}
