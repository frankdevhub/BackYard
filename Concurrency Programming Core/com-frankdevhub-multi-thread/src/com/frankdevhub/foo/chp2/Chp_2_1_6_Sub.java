package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_1_6_Sub
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��7�� ����10:30:17
 * @description: ����ͨ�������������ø��෽��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_1_6_Sub extends Chp_2_1_6_Main {

	public synchronized void operateISubMethod() {
		while (i > 0) {
			try {
				i--;
				System.out.println(Thread.currentThread().getName() + " Sub print i=" + i);
				Thread.sleep(100);
				this.operateIMainMethod(); // �����ڸ��ӹ�ϵ�̳�ʱ���������ͨ�������������ø����ͬ������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
