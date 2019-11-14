package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_2_11_Service
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��15�� ����2:35:01
 * @description: ͬ��synchronized��������ѭ���ȴ�����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_2_11_Service {

	protected class ThreadA extends Thread {
		private ObjectService service;

		public ThreadA(ObjectService service) {
			super();
			this.service = service;
		}

		@Override
		public void run() {
			super.run();
			service.methodA();
		}
	}

	protected class ThreadB extends Thread {
		private ObjectService service;

		public ThreadB(ObjectService service) {
			super();
			this.service = service;
		}

		@Override
		public void run() {
			super.run();
			service.methodB();
		}
	}

	protected class ObjectService {
		public void methodA() {

		}

		public void methodB() {
		}
	}

	protected class BaseService extends ObjectService {
		@Override
		synchronized public void methodA() {
			System.out.println("methodA begin");
			boolean isContinueRun = true;
			while (isContinueRun) {

			}
			System.out.println("methodA end");
		}

		@Override
		synchronized public void methodB() {
			System.out.println("methodB begin");
			System.out.println("methodB begin");
		}
	}

	protected class SubService extends ObjectService {
		Object object1 = new Object();
		Object object2 = new Object();

		@Override
		public void methodA() {
			synchronized (object1) {
				System.out.println("methodA begin");
				boolean isContinueRun = true;
				while (isContinueRun) {

				}
				System.out.println("methodA end");
			}
		}

		@Override
		public void methodB() {
			synchronized (object2) {
				System.out.println("methodB begin");
				System.out.println("methodB begin");
			}
		}
	}

	// ʹ��ͬ�������
	// methodA begin
	// methodB begin
	// methodB begin
	
	public static void main(String[] args) {
		Chp_2_2_11_Service service = new Chp_2_2_11_Service();
		/*BaseService baseService = service.new BaseService();
		// ��ʹ��ͬ������������´˴��������
		Thread threadA = service.new ThreadA(baseService);
		Thread threadB = service.new ThreadB(baseService);

		threadA.start();
		threadB.start();*/

		SubService subService = service.new SubService();
		Thread threadA = service.new ThreadA(subService);
		Thread threadB = service.new ThreadB(subService);

		threadA.start();
		threadB.start();
	}
}
