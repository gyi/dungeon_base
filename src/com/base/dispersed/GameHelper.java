package com.base.dispersed;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.base.def.entity.LessItem;
import com.base.pb.MsgCode.GameCode;
import com.base.pb.MsgSystem.ResAlert;
import com.core.general.StringHelper;
import com.core.net.netty.NettyConnection;
import com.core.server.AbsControler;
import com.google.protobuf.GeneratedMessage.Builder;

/**
 * 
 * @Create time : 2014-5-14
 * @author : wangl
 * @Description : 游戏工具
 */
public class GameHelper {
	private static Logger logger = LoggerFactory.getLogger(GameHelper.class);
	public static final int RANDOM_DENOMINATOR = 10000;

	/**
	 * 提示
	 * 
	 * @param controler
	 * @param alertType
	 * @param paramters
	 */
	public static void sendAlert(AbsControler<?> controler, int alertType, Object... paramters) {
		sendAlert(controler.connection(), alertType, paramters);
	}

	/**
	 * 提示
	 * 
	 * @param con
	 * @param alertType
	 * @param paramters
	 */
	public static void sendAlert(NettyConnection con, int alertType, Object... paramters) {
		ResAlert.Builder builder = ResAlert.newBuilder();
		builder.setType(alertType);
		for (Object object : paramters) {
			builder.addParameter(object.toString());
		}
		con.sendMsg(GameCode.RES_ALERT_VALUE, builder);

		logger.debug("{} alert {}", con.toString(), alertType);
	}

	/**
	 * 广播
	 * 
	 * @param controlers
	 *            广播对象
	 * @param code
	 *            消息号
	 * @param builder
	 *            广播内容
	 */
	public static void broadcast(Collection<AbsControler<?>> controlers, int code, Builder<?> builder) {
		broadcast(controlers, code, builder.build().toByteArray());
	}

	/**
	 * 广播
	 * 
	 * @param controlers
	 *            广播对象
	 * @param code
	 *            消息号
	 * @param data
	 *            广播内容
	 */
	public static void broadcast(Collection<AbsControler<?>> controlers, int code, byte[] data) {
		for (AbsControler<?> controler : controlers) {
			controler.sendMsg(code, data);
		}
	}

	/**
	 * 解析掉落信息
	 * 
	 * @param dropItemString
	 *            配置的字符串
	 * @return 掉落map
	 */
	public static Map<Integer, LessItem> parseDrop(String dropItemString) {
		Map<Integer, LessItem> map = new HashMap<>();
		if (!StringUtils.isEmpty(dropItemString)) {
			// 解析
			try {
				String[] dropStrings = dropItemString.split(StringHelper.leve2split);
				for (int i = 0; i < dropStrings.length; i++) {
					int[] parameters = StringHelper.toIntArray(StringHelper.leve1split, dropStrings[i]);
					LessItem lessItem = new LessItem(parameters[1], parameters[2]);
					map.put(parameters[0], lessItem);
				}
			} catch (Exception e) {
				throw new RuntimeException("parse drop error! " + dropItemString);
			}
		}
		return map;

	}
}
