package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_3_ThreadB
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��5�� ����9:14:10
 * @description: �����������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_3_ThreadB extends Thread {

	private Chp_2_1_3_HasSelfPrivateNum numRef;

	public Chp_2_1_3_ThreadB(Chp_2_1_3_HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}

}
