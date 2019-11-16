package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_3_3_RunThreadTest
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��16�� ����12:40:11
 * @description: �̹߳���ջ��˽��ջ��ͬ�����µ���ѭ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_3_3_RunThreadTest {

	protected class RunThread extends Thread {
		// �˴�Ӧʹ��volatileʹ�ù�����˽�е�����ջ����ͬ��
		// volatile private boolean isRunning = true;

		private boolean isRunning = true;

		public void setRunning(boolean isRunning) {
			this.isRunning = isRunning;
		}

		@Override
		public void run() {
			System.out.println("invoke run method");
			while (isRunning) {
				// try {
				// System.out.println("loop threadName=" +
				// Thread.currentThread().getName());
				// Thread.sleep(100);

				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
			}
			System.out.println("end run method");
		}
	}

	// ��whileѭ��ռ������Ȩ����ѭ��ʱ���̶߳�ȡ��˽��ջ���ݣ�
	// ��δ��ȡ�̹߳���ջ�е����ڴ��е����ݵ������ݲ�һ�������ѭ��
	public static void main(String[] args) {
		try {
			Chp_2_3_3_RunThreadTest runThreadTest = new Chp_2_3_3_RunThreadTest();
			RunThread runThread = runThreadTest.new RunThread();

			runThread.start();
			Thread.sleep(1000);
			runThread.setRunning(false);
			System.out.println("set isRunning as false");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
