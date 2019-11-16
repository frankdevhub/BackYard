package com.frankdevhub.foo.chp3;

/**
 * @ClassName: Chp_3_1_1_ThreadA
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��5�� ����9:36:24
 * @description: ��ʹ�õȴ�/֪ͨ����ʵ���̼߳�ͨ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_3_1_1_ThreadA extends Thread {

	private Chp_3_1_1_MyList list;

	public Chp_3_1_1_ThreadA(Chp_3_1_1_MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				list.add();
				System.out.println("list has been added " + (i + 1) + "elements");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
