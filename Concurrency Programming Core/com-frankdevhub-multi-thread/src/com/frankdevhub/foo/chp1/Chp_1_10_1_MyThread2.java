package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_10_1_MyThread2
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����6:42:00
 * @description: �߳����ȼ��ļ̳�����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_10_1_MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread2 run priority=" + this.getPriority());
	}
}
