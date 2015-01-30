package com.base.exception;

import com.base.def.DefType;

/**
 * 
 * @Create time : 2014-6-13
 * @author : wangl
 * @Description : 配置未找到异常
 */
public class NotFoundDefException extends RuntimeException {
	private static final long serialVersionUID = -8681457954252402362L;

	public NotFoundDefException(DefType defType, Object key) {
		super("not found def by type: " + defType + ", key: " + key);
	}

}
