package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_7_Service
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��7�� ����10:47:10
 * @description: �����쳣�����Զ��ͷ�
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_7_Service {
	synchronized public void testMethod() {
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println(
					"ThreadName=" + Thread.currentThread().getName() + " run beginTime= " + System.currentTimeMillis());
			int i = 1;
			while (i == 1) {
				if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
					System.out.println("ThreadName= "
							+ Thread.currentThread().getName()
							+" run exceptionTime= "
							+ System.currentTimeMillis());
					
					Integer.parseInt("a");
				}
			}
		} else {
			System.out.println(
					"ThreadName=" + Thread.currentThread().getName() + " run beginTime= " + System.currentTimeMillis());

		}
	}
}
