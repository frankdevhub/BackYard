package com.frankdevhub.foo.chp4;

import java.io.IOException;
import java.net.Socket;

/**
 * @ClassName: TestConnect2
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��10�� ����8:45:31
 * @description: ���Կͻ��˺ͷ���˵�����(�������������)
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class TestConnect2 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("www.baidu.comqweoaAAsdd==-2Aa", 80);
			System.out.println("client connect success");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("client connect fail");
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
