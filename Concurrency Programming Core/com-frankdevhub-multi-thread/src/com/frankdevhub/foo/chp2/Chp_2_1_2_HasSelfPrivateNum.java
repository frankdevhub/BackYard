package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_2_HasSelfPrivateNum
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��3�� ����10:59:11
 * @description: ʵ���������̰߳�ȫ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_2_HasSelfPrivateNum {

	private int num = 0;

	public void addI(String userName) {
		try {
			if (userName.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(userName + "\t" + "num=" + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
