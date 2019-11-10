package com.frankdevhub.foo.chp1;

import java.nio.CharBuffer;

/**
 * @ClassName: BufferTest2
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��8�� ����4:08:41
 * @description: ���ƻ�ȡ������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class BufferTest2 {
	public static void main(String[] args) {

		char[] charArray = new char[] { 'a', 'b', 'c', 'd', 'e' };
		CharBuffer charBuffer = CharBuffer.wrap(charArray);
		System.out.println("A capacity()=" + charBuffer.capacity() + " limit()=" + charBuffer.limit());
		charBuffer.limit(3);

		System.out.println();
		System.out.println("B capacity()=" + charBuffer.capacity() + " limit()=" + charBuffer.limit());

		charBuffer.put(0, 'o'); // 0
		charBuffer.put(1, 'p'); // 1
		charBuffer.put(2, 'q'); // 2
		charBuffer.put(3, 'r'); // 3--��λ���ǵ�һ������д������
		charBuffer.put(4, 's'); // 4
		charBuffer.put(5, 't'); // 5
		charBuffer.put(6, 'u'); // 6

	}
}
