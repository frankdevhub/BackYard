package com.frankdevhub.foo.chp4;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @ClassName: Server
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��10�� ����8:29:22
 * @description: ��֤ServerSocket��accept()����������������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Server {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(8090);
			System.out.println("server acccept startTime=" + System.currentTimeMillis());
			server.accept();

			System.out.println("server acccept endTime=" + System.currentTimeMillis());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
