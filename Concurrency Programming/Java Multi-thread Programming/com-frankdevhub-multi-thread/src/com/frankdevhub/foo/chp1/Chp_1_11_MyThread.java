package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_11_MyThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����9:44:09
 * @description: �ػ�����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_11_MyThread extends Thread {

	private int i = 0;

	@Override
	public void run() {
		try {
			while (true) {
				i++;
				System.out.println("i=" + (i));
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
