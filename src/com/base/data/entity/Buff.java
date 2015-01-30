package com.base.data.entity;

import java.io.Serializable;

/**
 * 
 * @Create time : 2014-9-5
 * @author : zhuqd
 * @Description :
 */
public class Buff implements Serializable {

	private static final long serialVersionUID = 8863358563076584433L;

	private int id;
	private int type;
	private long beginTime; // 开始时间
	private int duration; // 持续时间
	private int interval; // 生效间隔
	private double hits; // 效果数值
	private long attackerId;// buff施加者id
	private long updateTime;// 上次生效时间

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public double getHits() {
		return hits;
	}

	public void setHits(double hits) {
		this.hits = hits;
	}

	public long getAttackerId() {
		return attackerId;
	}

	public void setAttackerId(long attackerId) {
		this.attackerId = attackerId;
	}

	public long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
