package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_6_MyThread1
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��7�� ����10:35:55
 * @description: ����ͨ�������������ø��෽��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_6_MyThread1 extends Thread {

	@Override
	public void run() {
		Chp_2_1_6_Sub sub = new Chp_2_1_6_Sub();
		sub.operateISubMethod();
	}
}
