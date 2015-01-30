package com.base.exception;

/**
 * 
 * @Create time : 2014-7-7
 * @author : wangl
 * @Description : 未找到指定角色
 */
public class NotFoundRoleException extends Exception {
	private static final long serialVersionUID = -4482864145746173208L;

	public NotFoundRoleException(long roleId) {
		super("not found role by id: " + roleId);
	}

}
