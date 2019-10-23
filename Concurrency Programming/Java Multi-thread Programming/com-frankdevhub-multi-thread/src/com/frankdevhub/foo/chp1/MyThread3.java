package com.frankdevhub.foo.chp1;

/**
 * @ClassName: MyThread3
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��23�� ����7:09:03
 * @description: System.out.println()���̰߳�ȫ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class MyThread3 extends Thread {

	private int i = 5;

	@Override
	public void run() {
		System.out.println("i=" + i-- + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread3 run = new MyThread3();
		Thread t = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);

		t.start();
		t2.start();
		t3.start();
	}
}
