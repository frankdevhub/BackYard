package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_8_Sub
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��15�� ����12:36:04
 * @description: ͬ�������м̳���
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_8_Sub extends Chp_2_1_8_Main {
	// synchronized�˴��ؼ��ֲ��Ӳ���ʵ�ֵ������෽��ͬ��
	public void serviceMethod() {
		try {
			System.out.println("int sub next sleep begin threadName=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub next sleep end threadName=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());

			super.serviceMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
