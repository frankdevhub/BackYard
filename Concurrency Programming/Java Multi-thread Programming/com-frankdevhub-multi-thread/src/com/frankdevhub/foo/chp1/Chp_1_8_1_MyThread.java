package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_8_1_MyThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����11:34:43
 * @description: suspend��resume������ʹ��:��ͣ��ָ��߳�
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_8_1_MyThread extends Thread {

	private long i = 0;

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}

	@Override
	public void run() {
		while (true) {
			i++;
		}
	}
}
