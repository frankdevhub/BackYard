package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_8_2_SynchronizedObject
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����11:46:13
 * @description: suspend��resume������ȱ��:��ռ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_8_2_SynchronizedObject {

	synchronized public void printString() {
		System.out.println("begin");
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("thread a has been suspended at all");
			Thread.currentThread().suspend();
		}

		System.out.println("end");
	}
}
