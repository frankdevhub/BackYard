package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_10_2_Run
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����6:56:54
 * @description: ���ȼ����й�����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_10_2_Run {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Chp_1_10_2_MyThread1 thread1 = new Chp_1_10_2_MyThread1();
			thread1.setPriority(10);
			thread1.start();
			Chp_1_10_2_MyThread2 thread2 = new Chp_1_10_2_MyThread2();
			thread2.setPriority(1);
			thread2.start();
		}
	}
}
