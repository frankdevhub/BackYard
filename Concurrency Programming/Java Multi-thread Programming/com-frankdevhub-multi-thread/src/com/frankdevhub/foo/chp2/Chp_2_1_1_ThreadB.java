package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_1_ThreadB
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��29�� ����7:07:32
 * @description:�����ڵı���Ϊ�̰߳�ȫ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_1_ThreadB extends Thread {

	private Chp_2_1_1_HasSelfPrivateNum numRef;

	public Chp_2_1_1_ThreadB(Chp_2_1_1_HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}
}
