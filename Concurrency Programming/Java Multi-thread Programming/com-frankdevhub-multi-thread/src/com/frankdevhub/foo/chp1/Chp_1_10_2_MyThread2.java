package com.frankdevhub.foo.chp1;

import java.util.Random;

/**
 * @ClassName: Chp_1_10_2_MyThread2
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����6:56:28
 * @description:���ȼ����й�����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_10_2_MyThread2 extends Thread {
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		long addResult = 0;
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 50000; i++) {
				Random random = new Random();
				random.nextInt();

				addResult = addResult + i;
			}
		}

		long endTime = System.currentTimeMillis();
		System.out.println("<<<<<<<<<< thread2 use time=" + (endTime - beginTime));
	}
}
