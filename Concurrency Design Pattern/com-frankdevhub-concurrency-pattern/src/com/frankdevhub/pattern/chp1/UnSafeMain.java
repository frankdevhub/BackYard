package com.frankdevhub.pattern.chp1;

/**
 * @ClassName: UnSafeMain
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����10:08:34
 * @description: ��ʹ��Single Threaded Executionģʽ�ĳ���
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class UnSafeMain {

	// Testing Gate, hit CRTL+C to exit.
	// Alice BEGIN
	// Chris BEGIN
	// Boby BEGIN
	// ****** BROKEN ****** No.678: Chris, Canada
	// ****** BROKEN ****** No.1048: Chris, Canada
	// ****** BROKEN ****** No.1826: Chris, Canada

	public static void main(String[] args) {
		System.out.println("Testing Gate, hit CRTL+C to exit.");
		UnSafeGate gate = new UnSafeGate();

		new UnSafeUserThread(gate, "Alice", "Alaska").start();
		new UnSafeUserThread(gate, "Boby", "Brazil").start();
		new UnSafeUserThread(gate, "Chris", "Canada").start();
	}
}
