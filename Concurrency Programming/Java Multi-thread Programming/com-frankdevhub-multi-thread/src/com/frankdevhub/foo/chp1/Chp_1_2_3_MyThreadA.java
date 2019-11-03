package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp1_2_3_MyThreadA
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��28�� ����1:17:32
 * @description: ʵ���������̰߳�ȫ(�߳�֮�����Դ����-�̰߳�ȫ)
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_2_3_MyThreadA extends Thread {

	private int count = 5;

	public Chp_1_2_3_MyThreadA(String name) {
		super();
		this.setName(name);
	}

	@Override
	public void run() {
		while (count > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + count);
			count--;
		}
	}

	public static void main(String[] args) {
		Chp_1_2_3_MyThreadA a = new Chp_1_2_3_MyThreadA("A");
		Chp_1_2_3_MyThreadA b = new Chp_1_2_3_MyThreadA("B");
		Chp_1_2_3_MyThreadA c = new Chp_1_2_3_MyThreadA("C");

		a.start();
		b.start();
		c.start();
	}

}
