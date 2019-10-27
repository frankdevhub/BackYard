package com.frankdevhub.foo.chp1;

/**
 * @ClassName: MyThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��19�� ����8:09:56
 * @description: ʵ���������̰߳�ȫ(�߳�֮�����Դ������)
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp1_2_1_MyThread extends Thread {
	private int count = 5;

	public Chp1_2_1_MyThread(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		super.run();
		while (count >= 0) {
			System.out.println(Thread.currentThread().getName() + "====" + count);
			count--;
		}

	}

	public static void main(String[] args) {
		Thread a = new Thread("A");
		Thread b = new Thread("B");
		Thread c = new Thread("C");

		a.start();
		b.start();
		c.start();
	}
}