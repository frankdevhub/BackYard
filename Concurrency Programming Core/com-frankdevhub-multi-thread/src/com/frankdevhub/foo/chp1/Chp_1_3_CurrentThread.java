package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp1_3_CurrentThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��28�� ����1:29:22
 * @description: Thread.currentThread()������ʹ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_3_CurrentThread extends Thread {

	public Chp_1_3_CurrentThread() {
		System.out.println("[constructor]running current thread name:" + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println("[do run]running current thread name:" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// Thread test = new Thread(new Chp1_3_CurrentThread());
		Chp_1_3_CurrentThread test = new Chp_1_3_CurrentThread();
		// test.start(); //�� test��Ӧ�̵߳��ã�����Thread-0
		test.run(); // ֱ����main�������ã�����main
	}
}
