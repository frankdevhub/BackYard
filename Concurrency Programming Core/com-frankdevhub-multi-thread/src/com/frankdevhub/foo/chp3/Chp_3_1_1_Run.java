package com.frankdevhub.foo.chp3;

/**
 * @ClassName: Chp_3_1_1_Run
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��6�� ����9:09:03
 * @description: ��ʹ�õȴ�/֪ͨ����ʵ���̼߳�ͨ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_3_1_1_Run {

	public static void main(String[] args) {
		Chp_3_1_1_MyList list = new Chp_3_1_1_MyList();
		Chp_3_1_1_ThreadA threadA = new Chp_3_1_1_ThreadA(list);
		Chp_3_1_1_ThreadB threadB = new Chp_3_1_1_ThreadB(list);

		threadA.setName("A");
		threadA.start();

		threadB.setName("B");
		threadB.start();
	}
}
