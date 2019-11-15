package com.frankdevhub.foo.chp1;

/**
 * @ClassName: Chp_1_7_7_SynchronizedObject
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��3�� ����11:11:26
 * @description: �ͷ����Ĳ������:ǿ��stop�������ݲ�һ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_1_7_7_SynchronizedObject {
	private String userName = "a";
	private String passWord = "aa";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String passWord) {
		this.passWord = passWord;
	}

	synchronized public void printString(String userName, String passWord) {
		try {
			this.userName = userName;
			Thread.sleep(100000);
			this.passWord = passWord;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
