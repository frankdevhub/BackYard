package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_8_2_1_Run
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����3:16:54
 * @description: suspend��resume������ȱ��:��ռ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_8_2_1_Run {

	protected class MyThread extends Thread {
		private long i = 0;

		@Override
		public void run() {
			while (true) {
				i++;
				//System.out.println("i=" + i);��������PrintStream��ǰ�����ڴ�ӡʱ���������̲߳������"end"
			}
		}
	}

	public static void main(String[] args) {
		try {
			Thread thread = new Chp_1_8_2_1_Run().new MyThread();
			// thread.setDaemon(true); �����ػ��߳��򲻻��ռ����
			thread.start();
			Thread.sleep(1000);
			thread.suspend();
			System.out.println("main end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
