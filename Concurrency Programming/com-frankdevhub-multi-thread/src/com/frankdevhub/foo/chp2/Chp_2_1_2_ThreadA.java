package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_2_ThreadA
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��3�� ����11:03:38
 * @description: ʵ���������̰߳�ȫ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_2_ThreadA extends Thread {
	private Chp_2_1_2_HasSelfPrivateNum numRef;

	public Chp_2_1_2_ThreadA(Chp_2_1_2_HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("a");
	}
}
