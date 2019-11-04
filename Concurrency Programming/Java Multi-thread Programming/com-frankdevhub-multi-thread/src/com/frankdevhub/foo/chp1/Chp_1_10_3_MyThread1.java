package com.frankdevhub.foo.chp1;

import java.util.Random;

/**
 * @ClassName: Chp_1_10_3_MyThread1
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����9:33:55
 * @description: ���ȼ����������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_10_3_MyThread1 extends Thread {

	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			Random random = new Random();
			random.nextInt();
		}
		long endTime = System.currentTimeMillis();

		System.out.println(">>>>>>>>>> thread1 cost time=" + (endTime - beginTime));
	}
}
