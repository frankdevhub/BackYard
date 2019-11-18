package com.frankdevhub.jdk.framework;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: CyclicBarrierTest2
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��18�� ����9:02:37
 * @description: ͬ������CyclicBarrier������ִ��barrierAction��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class CyclicBarrierTest2 {

	public static CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new A());

	public static class A implements Runnable {
		static {
			System.out.println("run static block time=" + System.currentTimeMillis());
		}

		@Override
		public void run() {
			System.out.println("threadName=" + Thread.currentThread().getName() + " " + 3 
					+ " time=" + System.currentTimeMillis());
		}
	}

	protected class B extends Thread {
		@Override
		public void run() {
			System.out.println(
					"threadName=" + Thread.currentThread().getName() + " b" 
			        + " time=" + System.currentTimeMillis());
		}
	}

	// run static block time=1574061707787
	// threadName=Thread-0 b time=1574061707793
	// threadName=Thread-1 3 time=1574061707992
	// threadName=Thread-1 1 time=1574061707992
	// threadName=main 2 time=1574061707992
	
	public static void main(String[] args) {
		CyclicBarrierTest2 test2 = new CyclicBarrierTest2();
		Thread b = test2.new B();
		b.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(200); // �жϴ�ӡb�ʹ�ӡ1�ϼ��ص�ʱ��˳��

					cyclicBarrier.await();
					// System.out.println("threadName=" +
					// Thread.currentThread().getName() + " " + 1);
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
				System.out.println("threadName=" + Thread.currentThread().getName() 
						+ " " + 1 + " time="
						+ System.currentTimeMillis());
			}
		}).start();

		try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

		System.out.println(
				"threadName=" + Thread.currentThread().getName() + " " + 2
				+ " time=" + System.currentTimeMillis());
	}
}
