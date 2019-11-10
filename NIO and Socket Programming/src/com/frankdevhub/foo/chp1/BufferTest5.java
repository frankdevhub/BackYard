package com.frankdevhub.foo.chp1;

import java.nio.ByteBuffer;

/**
 * @ClassName: BufferTest5
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��10�� ����1:52:34
 * @description: ʹ��Buffer mark()����������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class BufferTest5 {
	public static void main(String[] args) {

		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

		System.out.println("byteBuffer.capacity()=" + byteBuffer.capacity());
		System.out.println();

		byteBuffer.position(1);
		byteBuffer.mark();

		System.out.println("byteBuffer.position()=" + byteBuffer.position());
		byteBuffer.position(2);
		byteBuffer.reset();

		System.out.println("byteBuffer.position()=" + byteBuffer.position());
	}
}
