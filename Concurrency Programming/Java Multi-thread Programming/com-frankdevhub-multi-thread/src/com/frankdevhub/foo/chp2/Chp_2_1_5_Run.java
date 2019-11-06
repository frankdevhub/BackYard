package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_5_Run
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��6�� ����10:02:47
 * @description: ���
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_5_Run {

	// getValue method name=main username=B password=AA
	// setValue method name=Thread-0 username=B password=BB

	public static void main(String[] args) {
		Chp_2_1_5_PublicVar publicVarRef = new Chp_2_1_5_PublicVar();
		try {
			Chp_2_1_5_ThreadA threadA = new Chp_2_1_5_ThreadA(publicVarRef);
			threadA.start();
			Thread.sleep(200); // ��ӡ����ܴ�ֵ�Ĵ�СӰ��

			publicVarRef.getValue();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
