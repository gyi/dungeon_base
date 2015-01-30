package com.base.rmi.global;

import java.rmi.Remote;
import java.util.Map;

import com.base.pb.MsgDefineRole.Property;

/**
 * 
 * @Create time : 2014-7-28
 * @author : wangl
 * @Description : 全局服务器角色RMI接口
 */
public interface GlobalRoleRMI extends Remote {

	/**
	 * 发送系统消息接口
	 * 
	 * @param teamId
	 * @param systemId
	 * @param channel
	 * @param parameter
	 * @throws Exception
	 */
	public void systemChat(long teamId, long systemId, int channel, Object... parameter) throws Exception;

	/**
	 * 角色进入副本
	 * 
	 * @param roleId
	 * @param mapLineId
	 * @return
	 * @throws Exception
	 */
	public Map<Property, Object> roleEnterDungeon(long roleId, long mapLineId) throws Exception;

	/**
	 * 角色离开副本
	 * 
	 * @param roleId
	 * @param mapLineId
	 * @param itemMap
	 * @param pickupMap
	 * @param killedMonster
	 * @throws Exception
	 */
	public void leaveDungeon(long roleId, long mapLineId, Map<Integer, Integer> itemMap, Map<Integer, Integer> pickupMap, Map<Integer, Integer> killedMonster)
			throws Exception;
}
