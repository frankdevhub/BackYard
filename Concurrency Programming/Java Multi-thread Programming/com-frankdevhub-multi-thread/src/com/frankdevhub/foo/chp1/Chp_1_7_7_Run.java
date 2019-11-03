package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_7_7_Run
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��3�� ����11:15:43
 * @description: �ͷ����Ĳ������:ǿ��stop�������ݲ�һ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_7_7_Run {

	public static void main(String[] args) {

		try {
			Chp_1_7_7_SynchronizedObject object = new Chp_1_7_7_SynchronizedObject();
			Chp_1_7_7_MyThread thread = new Chp_1_7_7_MyThread(object);

			thread.start();
			thread.sleep(500);
			thread.stop();
			System.out.println(object.getUserName() + " " + object.getPassword());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
