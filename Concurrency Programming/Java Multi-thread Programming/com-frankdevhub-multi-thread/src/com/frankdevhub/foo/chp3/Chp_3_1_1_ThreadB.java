package com.frankdevhub.foo.chp3;

/**
 * @ClassName: Chp_3_1_1_ThreadB
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��6�� ����9:03:40
 * @description: ��ʹ�õȴ�/֪ͨ����ʵ���̼߳�ͨ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_3_1_1_ThreadB extends Thread {

	private Chp_3_1_1_MyList list;

	public Chp_3_1_1_ThreadB(Chp_3_1_1_MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (list.getSize() == 5) {
					System.out.println("thread b start to terminate");
					throw new InterruptedException();
				}
			}
		} catch (Exception e) {
			e.printStackTrace(); //��ʵ���̲߳����ֶ��׳��쳣�˴��������ѭ��
		}
	}
}
