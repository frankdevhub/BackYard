package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_1_ThreadA
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��29�� ����7:06:30
 * @description:�����ڵı���Ϊ�̰߳�ȫ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_1_ThreadA extends Thread {
	private Chp_2_1_1_HasSelfPrivateNum numRef;

	public Chp_2_1_1_ThreadA(Chp_2_1_1_HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("a");
	}
}
