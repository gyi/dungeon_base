package com.base.countdown;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.core.server.timer.ITimer;
import com.core.server.work.WorkQueue;

@ITimer(cron = "1/1 * * * * * *")
public class CountdownManager {

	private static Logger logger = LoggerFactory.getLogger(CountdownManager.class);

	private Long queueId;

	private Map<Integer, Timer> threads = new HashMap<Integer, Timer>();

	private Map<Integer, Long> runtime = new HashMap<Integer, Long>();

	private Map<Integer, Long> starttime = new HashMap<Integer, Long>();

	private Map<Integer, CountdownCallback> runCallback = new HashMap<Integer, CountdownCallback>();

	public void init(WorkQueue workQueue) {

		queueId = workQueue.queueId();
		threads = new HashMap<Integer, Timer>();
		runtime = new HashMap<Integer, Long>();
		starttime = new HashMap<Integer, Long>();
		runCallback = new HashMap<Integer, CountdownCallback>();
	}

	public void init() {

		threads = new HashMap<Integer, Timer>();
		runtime = new HashMap<Integer, Long>();
		starttime = new HashMap<Integer, Long>();
		runCallback = new HashMap<Integer, CountdownCallback>();

	}

	public void run(final int id, final long time, final CountdownCallback countdown) {
		threads.get(id).schedule(new TimerTask() {

			@Override
			public void run() {
				countdown.onfinish(id);
				logger.info("id: " + id + " 开始计时");
			}
		}, time);
	}

	public void add(int id, long time, CountdownCallback countdown) {

		Timer timer = new Timer();
		threads.put(id, timer);
		starttime.put(id, System.currentTimeMillis());
		runtime.put(id, time);
		runCallback.put(id, countdown);
		run(id, time, countdown);
	}

	public void pause(int id) {
		if (isDelete(id)) {
			return;
		}
		threads.get(id).cancel();
		runtime.put(id, runtime.get(id) - (System.currentTimeMillis() - starttime.get(id)));
		starttime.put(id, System.currentTimeMillis());
		logger.info("id: " + id + " 暂停计时");
	}

	public void delete(int id) {
		if (isDelete(id)) {
			return;
		}
		threads.get(id).cancel();
		threads.remove(id);
		logger.info("id: " + id + " 删除计时");
	}

	public void recover(int id) {
		if (isDelete(id)) {
			return;
		}
		threads.remove(id);
		add(id, runtime.get(id), runCallback.get(id));
	}

	public boolean isDelete(int id) {
		if (threads.get(id) == null) {
			logger.info("id: " + id + " 没有添加或已删除这个计时");
			return true;
		}
		return false;
	}
}
