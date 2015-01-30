package com.base.def.type;

import java.util.Map;

import com.base.def.entity.DropDef;
import com.base.def.type.abs.MapDef;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-11-27
 * @author : wangl
 * @Description : 关卡配置表
 */
@Describle("关卡配置表")
public class DungeonDef extends MapDef {
	private static final long serialVersionUID = -3304967803770918845L;

	@Describle("副本类型(普通,精英等)")
	private int dungeonType;
	@Describle("体力消耗")
	private int energyConsum;
	@Describle("副本每次挑战次数限制")
	private int dayLimit;
	@Describle("挑战副本的限制时间")
	private int limitTime;
	@Describle("掉落配置")
	private DropDef dropDef;
	@Describle("解锁副本id列表<关卡id,章节id>")
	private Map<Integer, Integer> unlockMap;

	// 章节id
	private int chapterId;

	public int getDungeonType() {
		return dungeonType;
	}

	public void setDungeonType(int dungeonType) {
		this.dungeonType = dungeonType;
	}

	public int getEnergyConsum() {
		return energyConsum;
	}

	public void setEnergyConsum(int energyConsum) {
		this.energyConsum = energyConsum;
	}

	public int getDayLimit() {
		return dayLimit;
	}

	public void setDayLimit(int dayLimit) {
		this.dayLimit = dayLimit;
	}

	public int getLimitTime() {
		return limitTime;
	}

	public void setLimitTime(int limitTime) {
		this.limitTime = limitTime;
	}

	public DropDef getDropDef() {
		return dropDef;
	}

	public void setDropDef(DropDef dropDef) {
		this.dropDef = dropDef;
	}

	public void setUnlockMap(Map<Integer, Integer> unlockMap) {
		this.unlockMap = unlockMap;
	}

	public Map<Integer, Integer> getUnlockMap() {
		return unlockMap;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

}
