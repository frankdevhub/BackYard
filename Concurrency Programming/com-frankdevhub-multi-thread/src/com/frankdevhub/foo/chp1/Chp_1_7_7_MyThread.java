package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_7_7_MyThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��3�� ����11:14:53
 * @description: �ͷ����Ĳ������:ǿ��stop�������ݲ�һ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_7_7_MyThread extends Thread {
	private Chp_1_7_7_SynchronizedObject object;

	public Chp_1_7_7_MyThread(Chp_1_7_7_SynchronizedObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		object.printString("b", "bb");
	}
}
