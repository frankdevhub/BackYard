package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_4_ThreadA
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��5�� ����2:00:25
 * @description: synchronized�����������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_4_ThreadA extends Thread {

	private Chp_2_1_4_MyObject object;

	public Chp_2_1_4_ThreadA(Chp_2_1_4_MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.method();
	}
}
