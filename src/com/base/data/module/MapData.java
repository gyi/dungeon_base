package com.base.data.module;

import java.util.HashMap;
import java.util.Map;

import com.base.data.ModuleData;
import com.base.data.ModuleType;
import com.base.data.entity.DungeonHistory;

/**
 * 
 * @Create time : 2014-5-9
 * @author : wangl
 * @Description : 地图信息
 */
public class MapData extends ModuleData {
	private static final long serialVersionUID = 4478041404461205381L;
	private int townId;// 当前城镇id
	private Map<Integer, DungeonHistory> dungeonHistory = new HashMap<>();// 副本历史记录

	@Override
	public ModuleType moduleType() {
		return ModuleType.map;
	}

	public int getTownId() {
		return townId;
	}

	public void setTownId(int mapId) {
		this.townId = mapId;
	}

	public Map<Integer, DungeonHistory> getDungeonHistory() {
		return dungeonHistory;
	}

	public void setDungeonHistory(Map<Integer, DungeonHistory> dungeonHistory) {
		this.dungeonHistory = dungeonHistory;
	}

}
