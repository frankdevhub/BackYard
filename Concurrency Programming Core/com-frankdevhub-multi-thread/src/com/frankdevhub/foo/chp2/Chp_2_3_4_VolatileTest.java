package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_3_4_VolatileTest
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��16�� ����1:50:19
 * @description: volatile��ԭ�ӵ�����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_3_4_VolatileTest {

	// ��ȡʱ����������Խ������10000֤��volatile������ԭ���Ե�
	// count=8931
	// count=9031
	// count=9131
	// count=9231
	// count=9331
	// count=9431
	// count=9531
	// count=9631
	// count=9731
	// count=9831
	// count=9931
	public static void main(String[] args) {
		Chp_2_3_4_VolatileTest volatileTest = new Chp_2_3_4_VolatileTest();
		Chp_2_3_4_VolatileThread[] testThreads = new Chp_2_3_4_VolatileThread[100];
		for (int i = 0; i < testThreads.length; i++) {
			testThreads[i] = new Chp_2_3_4_VolatileThread();
		}

		for (int j = 0; j < testThreads.length; j++) {
			testThreads[j].start();
		}
	}
}
