package com.frankdevhub.foo.chp1;

import java.util.Random;

/**
 * @ClassName: Chp_1_10_3_MyThread2
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����9:34:34
 * @description: ���ȼ����������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_10_3_MyThread2 extends Thread {

	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			Random random = new Random();
			random.nextInt();
		}
		long endTime = System.currentTimeMillis();

		System.out.println("<<<<<<<<<< thread2 cost time=" + (endTime - beginTime));
	}
}
