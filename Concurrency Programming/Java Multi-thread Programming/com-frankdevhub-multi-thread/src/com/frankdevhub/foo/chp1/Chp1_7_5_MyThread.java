package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp1_7_5_MyThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��29�� ����6:56:23
 * @description: ǿ�Ʊ���ֹͣ�߳�
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp1_7_5_MyThread extends Thread {

	private int i = 0;

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("running thread i=" + i);
				this.sleep(100);
				i++;
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Chp1_7_5_MyThread thread = new Chp1_7_5_MyThread();
		thread.start();
		Thread.sleep(2000);
		thread.stop();// stop�������׳�java.lang.ThreadDeath�쳣,ͨ������²���Ҫ��ʾ�ز�׽
		System.out.println("end");
	}
}
