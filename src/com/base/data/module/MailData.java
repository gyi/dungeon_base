package com.base.data.module;

import java.util.LinkedList;
import java.util.Queue;

import com.base.data.ModuleData;
import com.base.data.ModuleType;
import com.base.data.entity.Mail;

/**
 * 
 * @Create time : 2014-5-21
 * @author : ZhangQiang
 * @Description : 邮件数据
 */
public class MailData extends ModuleData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3197138519864409458L;
	private Queue<Mail> Mails = new LinkedList<>();

	@Override
	public ModuleType moduleType() {
		return ModuleType.mail;
	}

	public Queue<Mail> getMails() {
		return Mails;
	}

	public void setMails(Queue<Mail> mails) {
		Mails = mails;
	}

}
