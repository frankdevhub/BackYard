package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp1_7_2_MyThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��29�� ����1:59:13
 * @description: Thread.interrupted()��ε��õĽ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp1_7_2_MyThread extends Thread {

	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("current Thread is interruped=" + Thread.interrupted());
		System.out.println("current Thread is interruped=" + Thread.interrupted());// �ڶ��ε���ʱ����ϴ�Thread.currentThread().interrupt()�����ı��
		System.out.println("current Thread is interruped=" + Thread.interrupted());//���ֲ���
	}
}
