package com.frankdevhub.jdk.framework;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: CyclicBarrierTest
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��18�� ����8:50:18
 * @description: ͬ������CyclicBarrier
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class CyclicBarrierTest {

	// ��Ϊ���̺߳����̵߳ĵ�������CPU�����ģ������̶߳��п�����ִ�У����Ի��������������

	// 1
	// 2
	// OR:
	// 2
	// 1

	public static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					cyclicBarrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
				System.out.println(1);
			}

		}).start();

		try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(2);
	}
}
