package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_1_HasSelfPrivateNum
 * @author: frankdevhub@gmail.com
 * @date: 2019年10月29日 下午7:05:44
 * @description:方法内的变量为线程安全
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_1_HasSelfPrivateNum {
	public void addI(String userName) {
		try {
			int num = 0;
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
