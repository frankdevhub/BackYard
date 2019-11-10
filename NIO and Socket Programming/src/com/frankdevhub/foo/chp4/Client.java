package com.frankdevhub.foo.chp4;

import java.io.IOException;
import java.net.Socket;

/**
 * @ClassName: Client
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��10�� ����8:34:00
 * @description: �ͻ������ӷ����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Client {
	// client connect server beginTime=1573389520821
	// client connect server endTime=1573389520851
	public static void main(String[] args) {
		try {
			System.out.println("client connect server beginTime=" + System.currentTimeMillis());
			Socket socket = new Socket("localhost", 8090);
			System.out.println("client connect server endTime=" + System.currentTimeMillis());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
