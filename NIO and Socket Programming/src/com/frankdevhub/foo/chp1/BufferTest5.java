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

	// ��������capacity����Ϊ���������������limit����Ϊ��������������position����Ϊ����
	public static void test1() {
		try {
			@SuppressWarnings("unused")
			ByteBuffer byteBuffer = ByteBuffer.allocate(-1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// position���ܴ�����limit
	public static void test2() {

	}

	// limit���ܴ�����capacity
	public static void test3() {
	}

	// ���������mark�����ڽ�position��limit����С�ڸ�mark��ֵʱ����mark������
	public static void test4() {

	}

	// ���δ������mark����ô����reset���׳�InvalidaMarkException�쳣
	public static void test5() {

	}

	// ���position�����µ�limit����position��ֵ������limit��ֵ
	public static void test6() {

	}

	// ��position��limitֵһ��ʱ����ָ����positionд�����ݻ�����쳣����Ϊ��λ���Ǳ����Ƶ�
	public static void test7() {

	}

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
