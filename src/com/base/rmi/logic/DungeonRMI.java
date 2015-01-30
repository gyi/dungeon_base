package com.base.rmi.logic;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

/**
 * 
 * @Create time : 2014-5-22
 * @author : wangl
 * @Description : 地图远程调用接口
 */
public interface DungeonRMI extends Remote {

	/**
	 * 重新加载配置文件
	 * 
	 * @param 资源已被重新加载
	 * @throws RemoteException
	 */
	public void defBeRoload() throws RemoteException;

	/**
	 * 创建关卡副本
	 * 
	 * @param mapDefId
	 *            地图配置id
	 * @param dungeonId
	 *            副本id
	 * @param checkLoadRoleIds
	 *            需要检测加载完成的玩家id
	 * @return 是否开启成功
	 * @throws RemoteException
	 */
	public boolean createDungeon(int mapDefId, long dungeonId, Set<Long> checkLoadRoleIds) throws RemoteException;

	/**
	 * 断开地图服原玩家的连接
	 * 
	 * @param roleId
	 * @return 是否需要异步等待逻辑服进行移除玩家操作(true:需要)
	 * @throws RemoteException
	 */
	public void kickRole(long roleId) throws RemoteException;

}
