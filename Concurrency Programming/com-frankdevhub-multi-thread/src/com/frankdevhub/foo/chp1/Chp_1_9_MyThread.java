package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_9_MyThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����6:13:44
 * @description: yield����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_9_MyThread extends Thread {

	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i <= 50000000; i++) {
			Thread.yield(); // �ó�CPUȻ������ȡ
			count = count + (i + 1);

		}
		long endTime = System.currentTimeMillis();
		System.out.println("cost:" + (endTime - beginTime) + "mills");
	}
}
