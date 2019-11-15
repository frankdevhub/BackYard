package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_8_1_Run
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����11:37:52
 * @description: suspend��resume������ʹ��:��ͣ��ָ��߳�
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_8_1_Run {
	public static void main(String[] args) {
		try {
			Chp_1_8_1_MyThread thread = new Chp_1_8_1_MyThread();
			thread.start();
			Thread.sleep(5000);
			// A��
			thread.suspend();
			System.out.println("A=" + System.currentTimeMillis() + "i=" + thread.getI());
			thread.sleep(5000);
			System.out.println("A=" + System.currentTimeMillis() + "i=" + thread.getI());
			// B��
			thread.resume();
			Thread.sleep(5000);
			// C��
			thread.suspend();
			System.out.println("B=" + System.currentTimeMillis() + "i=" + thread.getI());
			thread.sleep(5000);
			System.out.println("B=" + System.currentTimeMillis() + "i=" + thread.getI());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
