package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_2_Run
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��3�� ����10:58:27
 * @description: ʵ���������̰߳�ȫ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_2_Run {

	public static void main(String[] args) {
		// ʵ���������̰߳�ȫ
		Chp_2_1_2_HasSelfPrivateNum numRef = new Chp_2_1_2_HasSelfPrivateNum();
		Chp_2_1_2_ThreadA threadA = new Chp_2_1_2_ThreadA(numRef);
		Chp_2_1_2_ThreadB threadB = new Chp_2_1_2_ThreadB(numRef);

		threadA.start();
		threadB.start();
	}
}
