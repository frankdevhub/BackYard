package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_4_MyObject
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��5�� ����1:55:54
 * @description: synchronized�����������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_4_MyObject {
	synchronized public void method() {
		try {
			System.out.println("method begin threadName=" + Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
