package com.frankdevhub.foo.chp4;

/**
 * @ClassName: Chp_4_1_1_MyThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��6�� ����10:23:03
 * @description: ʹ��ReentrantLockʵ��ͬ��������1
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_4_1_1_MyThread extends Thread {

	private Chp_4_1_1_MyService service;

	public Chp_4_1_1_MyThread(Chp_4_1_1_MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.testMethod();
	}
}
