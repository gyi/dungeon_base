package com.base.def.entity;

import java.io.Serializable;
import java.util.Map;

import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-11-27
 * @author : wangl
 * @Description : 地图单位刷新配置
 */
public class MapUnitRefreshDef implements Serializable {
	private static final long serialVersionUID = 3735983669201345860L;
	@Describle("区域编号")
	private int areaId;
	@Describle("key单位id, value单位数量")
	private Map<Integer, Integer> unitMap;

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public Map<Integer, Integer> getUnitMap() {
		return unitMap;
	}

	public void setUnitMap(Map<Integer, Integer> unitMap) {
		this.unitMap = unitMap;
	}

}
