package com.base.rmi.global;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

import com.base.def.BaseDef;
import com.base.def.DefType;

/**
 * 
 * @Create time : 2014-5-23
 * @author : wangl
 * @Description : 全局服务器RMI接口
 */
public interface GlobalRMI extends Remote {

	/**
	 * 获取所有配置数据
	 * 
	 * @return
	 */
	public Map<DefType, Map<Object, BaseDef<? extends Serializable>>> getAllDef() throws RemoteException;

	/**
	 * 在全局服务器上注册逻辑服
	 * 
	 * @param host
	 *            ip地址
	 * @param rmiPort
	 *            RMI服务端口
	 * @param mapPort
	 *            地图服务器网络端口
	 * @return 逻辑服id 如果返回0.表示失败
	 */
	public int registerLogic(String host, int rmiPort, int mapPort) throws Exception;

	/**
	 * 副本开始
	 * 
	 * @param dungeonId
	 */
	public void dungeonStart(long dungeonId) throws Exception;

	/**
	 * 副本结束
	 * 
	 * @param dungeonId
	 * @param starLevel
	 * @param useTime
	 */
	public void dungeonEnd(long dungeonId, boolean pass, int starLevel, int useTime) throws Exception;

	/**
	 * 副本关闭
	 * 
	 * @param dungeonId
	 * @param mapState
	 * @throws Exception
	 */
	public void dungeonClose(long dungeonId) throws Exception;

}
