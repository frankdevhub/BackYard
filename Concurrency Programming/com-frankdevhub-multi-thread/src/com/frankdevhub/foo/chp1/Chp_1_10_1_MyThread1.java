package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_10_1_MyThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����6:40:15
 * @description: �߳����ȼ��ļ̳�����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_10_1_MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread1 run priority=" + this.getPriority());
		Chp_1_10_1_MyThread2 thread = new Chp_1_10_1_MyThread2();
		thread.start();
	}
}
