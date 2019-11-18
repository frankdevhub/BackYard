package com.frankdevhub.jdk.framework;

import java.util.Map.Entry;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @ClassName: BankWorkService
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��18�� ����3:42:17
 * @description: CyclicBarrier��Ӧ�ó���
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class BankWorkService implements Runnable {

	// ����4�����ϣ�������֮��ִ�е�ǰ��run����
	private CyclicBarrier c = new CyclicBarrier(4, this);

	// ����ֻ��4��sheet������ֻ����4���߳�
	private Executor executor = Executors.newFixedThreadPool(4);

	// ����ÿ��sheet��������������
	private ConcurrentHashMap<String, Integer> sheetBankWaterCount = new ConcurrentHashMap<>(4);

	private void count() {
		for (int i = 0; i < 4; i++) {
			executor.execute(new Runnable() {

				@Override
				public void run() {
					sheetBankWaterCount.put(Thread.currentThread().getName(), 1);
					try {
						c.await();
					} catch (InterruptedException | BrokenBarrierException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	@Override
	public void run() {
		int result = 0;

		// ����ÿ��sheet������Ľ��
		for (Entry<String, Integer> sheet : sheetBankWaterCount.entrySet())
			result += sheet.getValue();

		// ��������
		sheetBankWaterCount.put("result", result);
		System.out.println("result=" + result);
	}

	public static void main(String[] args) {
		BankWorkService bankWorkService = new BankWorkService();
		bankWorkService.count();
	}
}
