package com.base.helper;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

/**
 * 
 * @Create time : 2014-12-5
 * @author : wangl
 * @Description : 时间辅助工具
 */
public class TimeHelper {

	/**
	 * 获取当前时间（秒）
	 * 
	 * @return
	 */
	public static long currentTimeSeconds() {
		return System.currentTimeMillis() / DateUtils.MILLIS_PER_SECOND;
	}

	/**
	 * 获取当前时间（分钟）
	 * 
	 * @return
	 */
	public static long currentTimeMinutes() {
		return System.currentTimeMillis() / DateUtils.MILLIS_PER_MINUTE;
	}

	/**
	 * 判断当前时间，是否超过指定时间
	 * 
	 * @param hour
	 * @param minute
	 * @param second
	 * @return 等于或超过都返回true
	 */
	public static boolean timeAfter(int hour, int minute, int second) {
		Calendar calendar = Calendar.getInstance();
		if (calendar.get(Calendar.HOUR_OF_DAY) < hour) {
			return false;// 小时
		} else if (calendar.get(Calendar.MINUTE) < minute) {
			return false;// 分钟
		} else if (calendar.get(Calendar.SECOND) < second) {
			return false;// 秒
		} else {
			return true;// 满足
		}
	}

	/**
	 * 获取指定时间在当天的分钟数
	 * 
	 * @param time
	 * @return
	 */
	public static int getDayMinute(long time) {
		return getDayMinute(new Date(time));
	}

	/**
	 * 获取指定时间在当天的分钟数
	 * 
	 * @param date
	 * @return
	 */
	public static int getDayMinute(Date date) {
		if (date == null) {
			return 0;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return getDayMinute(calendar);
	}

	/**
	 * 获取指定时间在当天的分钟数
	 * 
	 * @param calendar
	 * @return
	 */
	public static int getDayMinute(Calendar calendar) {
		if (calendar == null) {
			return 0;
		}
		return calendar.get(Calendar.HOUR_OF_DAY) * 60 + calendar.get(Calendar.MINUTE);
	}

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Calendar calendar2 = Calendar.getInstance();
		System.out.println(calendar2);
		boolean is = DateUtils.isSameDay(calendar, calendar2);
		System.out.println(is);

		// int nowYear = calendar.get(Calendar.YEAR);// 年
		// int nowMonth = calendar.get(Calendar.MONTH) + 1;// 月
		// int nowDay = calendar.get(Calendar.DAY_OF_MONTH);// 日
		// int nowHour = calendar.get(Calendar.HOUR_OF_DAY);// 小时
		// int nowMinute = calendar.get(Calendar.MINUTE);// 分钟
		// int nowSecond = calendar.get(Calendar.SECOND);// 秒
		// System.out.println(nowYear + "-" + nowMonth + "-" + nowDay + " " +
		// nowHour + ":" + nowMinute + ":" + nowSecond);
		// System.out.println(timeAfter(15, 48, 0));
		//
		// Format format = new SimpleDateFormat("yyyy-MM-dd");
		// String data1 = format.format(System.currentTimeMillis());
		// System.out.println(data1);
		// String data2 = format.format(System.currentTimeMillis());
		// System.out.println(data2);
		// System.out.println(data1.equals(data2));
		// System.out.println(getDayMinute(System.currentTimeMillis()));
	}
}
