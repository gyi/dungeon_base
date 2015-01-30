package com.base.exception;

/**
 * 
 * @Create time : 2014-7-7
 * @author : wangl
 * @Description : 未找到指定地图
 */
public class NotFoundMapException extends Exception {
	private static final long serialVersionUID = -4482864145746173208L;

	public NotFoundMapException(long mapLineId) {
		super("not found map by lineId: " + mapLineId);
	}

}
