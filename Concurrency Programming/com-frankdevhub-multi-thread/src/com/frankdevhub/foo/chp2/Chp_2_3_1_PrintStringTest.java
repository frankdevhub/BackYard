package com.frankdevhub.foo.chp2;

/**
 * @ClassName: Chp_2_3_1_PrintStringTest
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��16�� ����12:23:15
 * @description: �ؼ��� volatile����ѭ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_2_3_1_PrintStringTest {

	protected class PrintString {
		private boolean isContinuePrint = true;

		public boolean isContinuePrint() {
			return this.isContinuePrint;
		}

		public void setContinuePrint(boolean isContinue) {
			this.isContinuePrint = isContinue;
		}

		public void printMethod() {
			while (isContinuePrint) {
				try {
					System.out.println("run printStringMethod threadName="
				           +Thread.currentThread().getName());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Chp_2_3_1_PrintStringTest printStringTest = new Chp_2_3_1_PrintStringTest();
		PrintString printString = printStringTest.new PrintString();
		printString.printMethod();
		
		System.out.println("stop print string thread threadName="
		                              +Thread.currentThread().getName());
		printString.setContinuePrint(false);
		
		
	}
}
