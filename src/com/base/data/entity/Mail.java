package com.base.data.entity;

import java.io.Serializable;
import java.util.Date;

import com.base.def.entity.LessItem;

/**
 * 
 * @Create time : 2014-5-21
 * @author : ZhangQiang
 * @Description : 邮件的基本信息
 */

public class Mail implements Serializable {

	private static final long serialVersionUID = 3266859021423755881L;
	private String mailId;// 邮箱id
	private int MailType;// 邮件类型
	private long senderId;// 发件人id
	private String[] senderParameter;// 发件人昵称可变参
	private long receiverId;// 收件者id
	private Date senderTime;// 发送时间
	private String title;// 标题
	private String[] titleParameter;// 标题可变参
	private String content;// 内容
	private String[] contentParameter;// 内容可变参
	private boolean isRead;// 是否已读
	private boolean isClaim;// 是否收取附
	private LessItem[] lessItems = new LessItem[0];

	@Override
	public String toString() {
		return new StringBuilder().append("[").append(senderParameter).append(",").append(titleParameter).append(",").append(contentParameter).append("]")
				.toString();
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Date getSenderTime() {
		return senderTime;
	}

	public void setSenderTime(Date senderTime) {
		this.senderTime = senderTime;
	}

	public long getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(long receiverId) {
		this.receiverId = receiverId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

	public boolean isClaim() {
		return isClaim;
	}

	public void setClaim(boolean isClaim) {
		this.isClaim = isClaim;
	}

	public int getMailType() {
		return MailType;
	}

	public void setMailType(int mailType) {
		MailType = mailType;
	}

	public long getSenderId() {
		return senderId;
	}

	public void setSenderId(long senderId) {
		this.senderId = senderId;
	}

	public String[] getContentParameter() {
		return contentParameter;
	}

	public void setContentParameter(String[] contentParameter) {
		this.contentParameter = contentParameter;
	}

	public String[] getSenderParameter() {
		return senderParameter;
	}

	public void setSenderParameter(String[] senderParameter) {
		this.senderParameter = senderParameter;
	}

	public String[] getTitleParameter() {
		return titleParameter;
	}

	public void setTitleParameter(String[] titleParameter) {
		this.titleParameter = titleParameter;
	}

	public LessItem[] getLessItems() {
		return lessItems;
	}

	public void setLessItems(LessItem[] lessItems) {
		this.lessItems = lessItems;
	}

}
