package com.base.def.type.abs;

import java.util.Map;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.base.def.entity.AreaDef;
import com.base.def.entity.CounterDef;
import com.base.def.entity.MapCampDef;
import com.base.def.entity.MapTeamDef;
import com.base.def.entity.MapUnitRefreshDef;
import com.base.def.entity.SceneDef;
import com.base.def.entity.event.EventDef;
import com.core.way.navmesh.Navmesh;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-5-8
 * @author : wangl
 * @Description : 地图配置表基类
 */
public abstract class MapDef implements BaseDef<Integer> {
	private static final long serialVersionUID = -1437748187487560169L;
	@Describle("地图id")
	private int id;
	@Describle("地图名称")
	private String name;
	@Describle("地图类型")
	private int mapType;
	@Describle("进入地图后第一个打开的事件")
	private int startEventId;
	@Describle("地形信息")
	private SceneDef scenedef;
	@Describle("区域map")
	private Map<Integer, AreaDef> areaMap;
	@Describle("事件map")
	private Map<Integer, EventDef> eventMap;
	@Describle("单位刷新map")
	private Map<Integer, MapUnitRefreshDef> unitRefreshMap;
	@Describle("计时器map")
	private Map<Integer, Integer> countDownMap;
	@Describle("计数器map")
	private Map<Integer, CounterDef> counterMap;
	@Describle("阵营配置")
	private Map<Integer, MapCampDef> mapCampMap;

	@Describle("地图中玩家队伍配置")
	private MapTeamDef[] mapTeamDefs;
	@Describle("地图等级")
	private int level;
	@Describle("最小玩家数量")
	private int minRole;
	@Describle("最大玩家数量")
	private int maxRole;
	@Describle("副本难度系数")
	private Map<Integer, Integer> difficultyMap;
	@Describle("复活策略(REBORN_MODE = 1;//重生策略DEATH_MODE = 2;//死亡模式DRAFT_MODE = 3;//竞技模式)")
	private int rebornStrategy;
	@Describle("限制使用的道具id")
	private int[] limitItemIds;
	@Describle("限制使用的技能")
	private int[] limitSkillIds;
	@Describle("怪物总数量统计")
	private int monsterPoolSize;

	// 地形数据
	private Navmesh navmesh;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public DefType getDefType() {
		return DefType.MAP;
	}

	@Override
	public String toString() {
		return "[" + name + ":" + id + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMapType() {
		return mapType;
	}

	public void setMapType(int mapType) {
		this.mapType = mapType;
	}

	public int getStartEventId() {
		return startEventId;
	}

	public void setStartEventId(int startEventId) {
		this.startEventId = startEventId;
	}

	public Map<Integer, AreaDef> getAreaMap() {
		return areaMap;
	}

	public void setAreaMap(Map<Integer, AreaDef> areaMap) {
		this.areaMap = areaMap;
	}

	public Map<Integer, EventDef> getEventMap() {
		return eventMap;
	}

	public void setEventMap(Map<Integer, EventDef> eventMap) {
		this.eventMap = eventMap;
	}

	public Map<Integer, MapUnitRefreshDef> getUnitRefreshMap() {
		return unitRefreshMap;
	}

	public void setUnitRefreshMap(Map<Integer, MapUnitRefreshDef> unitRefreshMap) {
		this.unitRefreshMap = unitRefreshMap;
	}

	public SceneDef getScenedef() {
		return scenedef;
	}

	public void setScenedef(SceneDef scenedef) {
		this.scenedef = scenedef;
	}

	public MapTeamDef[] getMapTeamDefs() {
		return mapTeamDefs;
	}

	public void setMapTeamDefs(MapTeamDef[] teamDef) {
		this.mapTeamDefs = teamDef;
	}

	public Map<Integer, Integer> getDifficultyMap() {
		return difficultyMap;
	}

	public void setDifficultyMap(Map<Integer, Integer> difficultyMap) {
		this.difficultyMap = difficultyMap;
	}

	public int getRebornStrategy() {
		return rebornStrategy;
	}

	public void setRebornStrategy(int rebornStrategy) {
		this.rebornStrategy = rebornStrategy;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMinRole() {
		return minRole;
	}

	public void setMinRole(int minRole) {
		this.minRole = minRole;
	}

	public int getMaxRole() {
		return maxRole;
	}

	public void setMaxRole(int maxRole) {
		this.maxRole = maxRole;
	}

	public int[] getLimitItemIds() {
		return limitItemIds;
	}

	public void setLimitItemIds(int[] limitItemIds) {
		this.limitItemIds = limitItemIds;
	}

	public int[] getLimitSkillIds() {
		return limitSkillIds;
	}

	public void setLimitSkillIds(int[] limitSkillIds) {
		this.limitSkillIds = limitSkillIds;
	}

	public Map<Integer, Integer> getCountDownMap() {
		return countDownMap;
	}

	public void setCountDownMap(Map<Integer, Integer> countDownMap) {
		this.countDownMap = countDownMap;
	}

	public Map<Integer, CounterDef> getCounterMap() {
		return counterMap;
	}

	public void setCounterMap(Map<Integer, CounterDef> counterMap) {
		this.counterMap = counterMap;
	}

	public Map<Integer, MapCampDef> getMapCampMap() {
		return mapCampMap;
	}

	public void setMapCampMap(Map<Integer, MapCampDef> mapCampMap) {
		this.mapCampMap = mapCampMap;
	}

	public int getMonsterPoolSize() {
		return monsterPoolSize;
	}

	public void setMonsterPoolSize(int monsterPoolSize) {
		this.monsterPoolSize = monsterPoolSize;
	}

	public Navmesh getNavmesh() {
		return navmesh;
	}

	public void setNavmesh(Navmesh navmesh) {
		this.navmesh = navmesh;
	}

}
