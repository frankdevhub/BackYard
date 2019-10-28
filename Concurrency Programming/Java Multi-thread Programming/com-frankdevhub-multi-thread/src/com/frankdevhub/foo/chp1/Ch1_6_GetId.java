package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Ch1_6_GetId
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��28�� ����11:47:27
 * @description: getId()���� 
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Ch1_6_GetId extends Thread {

	//Thread.currentThread()����²�����ִ��
	@Override
	public void run() {
		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("CurrentThreadId=" + Thread.currentThread().getId());
		System.out.println("this.getId()=" + this.getId());
	}

	//return 
	//main-> thread.getName()=main	 main this.getId()=1
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId());
		Thread thread = Thread.currentThread(); 
		System.out.println(thread==Thread.currentThread());
		//thread.start(); // Thread.currentThread()����ʱ��java.lang.IllegalThreadStateException
		System.out.println("main-> thread.getName()=" + thread.getName() + "\t main this.getId()=" + thread.getId());
	}
}
