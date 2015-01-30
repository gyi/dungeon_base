package com.base.exception;

/**
 * 
 * @Create time : 2014-8-13
 * @author : wangl
 * @Description : 指定id不是货币道具
 */
public class NotCurrencyException extends RuntimeException {
	private static final long serialVersionUID = -7533567336378453302L;

	public NotCurrencyException(long id) {
		super("id: " + id + " not a currency ID");
	}

}
