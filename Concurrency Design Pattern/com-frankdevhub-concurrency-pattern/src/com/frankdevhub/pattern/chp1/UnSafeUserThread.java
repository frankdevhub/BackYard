package com.frankdevhub.pattern.chp1;

/**
 * @ClassName: UnSafeUserThread
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��4�� ����10:07:32
 * @description: ��ʹ��Single Threaded Executionģʽ�ĳ���
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class UnSafeUserThread extends Thread {

	private final UnSafeGate gate;
	private final String myname;
	private final String address;

	public UnSafeUserThread(UnSafeGate gate, String myname, String address) {
		this.gate = gate;
		this.myname = myname;
		this.address = address;
	}

	@Override
	public void run() {
		System.out.println(myname + " BEGIN");
		while (true) {
			gate.pass(myname, address);
		}
	}
}
