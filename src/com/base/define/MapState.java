package com.base.define;

/**
 * 
 * @Create time : 2014-11-24
 * @author : wangl
 * @Description : 地图状态
 */
public enum MapState {

	/** 角色加载中 */
	load(2 * 60 * 1000), // 2min

	/** 角色游戏过程中 */
	role_play(30 * 60 * 1000), // 32min

	/** 关卡结束 */
	end(30 * 1000);// 30s

	private int timeout;// 该状态超时时间，0为不超时,超时地图将被移除

	private MapState(int timeout) {
		this.timeout = timeout;
	}

	public int timeout() {
		return timeout;
	}

}
