package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_1_Run
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��29�� ����7:07:39
 * @description:�����ڵı���Ϊ�̰߳�ȫ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_1_Run {
	public static void main(String[] args) {

		// ����numRef���ǻ����̰߳�ȫ�����
		Chp_2_1_1_HasSelfPrivateNum numRef = new Chp_2_1_1_HasSelfPrivateNum();
		Chp_2_1_1_ThreadA threadA = new Chp_2_1_1_ThreadA(numRef);
		Chp_2_1_1_ThreadB threadB = new Chp_2_1_1_ThreadB(numRef);

		threadA.start();
		threadB.start();
	}
}
