package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_4_Run
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��5�� ����9:30:03
 * @description: synchronized�����������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_4_Run {

	// Object�������ͬ���ؼ���ʱ
	// method begin threadName=A
	// end
	// method begin threadName=B
	// end

	// Object������ͬ������ʱ
	// method begin threadName=A
	// method begin threadName=B
	// end
	// end

	public static void main(String[] args) {

		Chp_2_1_4_MyObject object = new Chp_2_1_4_MyObject();
		Chp_2_1_4_ThreadA threadA = new Chp_2_1_4_ThreadA(object);
		threadA.setName("A");
		Chp_2_1_4_ThreadB threadB = new Chp_2_1_4_ThreadB(object);
		threadB.setName("B");

		threadA.start();
		threadB.start();

	}
}
