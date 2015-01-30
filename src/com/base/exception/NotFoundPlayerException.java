package com.base.exception;

/**
 * 
 * @Create time : 2014-7-7
 * @author : wangl
 * @Description : 未找到指定玩家
 */
public class NotFoundPlayerException extends Exception {
	private static final long serialVersionUID = -4482864145746173208L;

	public NotFoundPlayerException(long playerId) {
		super("not found player by id: " + playerId);
	}

}
