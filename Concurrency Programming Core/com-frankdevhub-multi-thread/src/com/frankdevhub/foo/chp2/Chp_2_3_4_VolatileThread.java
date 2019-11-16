package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_3_4_VolatileThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��16�� ����1:55:06
 * @description: volatile��ԭ�ӵ�����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_3_4_VolatileThread extends Thread {
	volatile public static int count;

	//����static�ؼ���
	//�����Ƕ�Chp_2_3_4_VolatileThread.class���м���
	//�Ӷ�ʵ����ͬ��Ч��
	
/*	synchronized private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count=" + count);
	}
*/
	
	
	private void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count=" + count);
	}

	@Override
	public void run() {
		addCount();
	}

}
