package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_5_ThreadA
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��6�� ����9:57:36
 * @description: ���
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_5_ThreadA extends Thread {

	private Chp_2_1_5_PublicVar publicVar;

	public Chp_2_1_5_ThreadA(Chp_2_1_5_PublicVar publicVar) {
		super();
		this.publicVar = publicVar;
	}

	@Override
	public void run() {
		super.run();
		publicVar.setValue("B", "BB");
	}
}
