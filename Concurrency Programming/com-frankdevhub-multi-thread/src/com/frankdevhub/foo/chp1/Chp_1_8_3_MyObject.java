package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_8_3_MyObject
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����5:36:21
 * @description: suspend��resume������ȱ��:��ͬ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_8_3_MyObject {
	private String username = "1";
	private String password = "11";

	public void setValue(String u, String p) {
		this.username = u;
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("thread a suspend");
			Thread.currentThread().suspend();
		}

		this.password = p;
	}

	public void printUsernamePassword() {
		System.out.println(username + " " + password);
	}
}
