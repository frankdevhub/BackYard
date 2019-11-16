package com.frankdevhub.foo.chp4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: Chp_4_1_2_MyService
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��6�� ����10:48:48
 * @description: ʹ��ReentrantLockʵ��ͬ��������2
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_4_1_2_MyService {

	private ReentrantLock lock = new ReentrantLock();

	public void methodA() {
		try {
			lock.lock();

			System.out.println("methodA begin thread name=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodA end thread name=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void methodB() {
		try {
			lock.lock();

			System.out.println("methodB begin thread name=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodB end thread name=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
