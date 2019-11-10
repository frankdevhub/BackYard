package com.frankdevhub.foo.chp1;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/**
 * @ClassName: BufferTest5
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��10�� ����1:52:34
 * @description: ʹ��Buffer mark()����������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class BufferTest5 {

	// ��������capacity����Ϊ���������������limit����Ϊ��������������position����Ϊ����
	// capacity����Ϊ����
	public static void test1() {
		try {
			@SuppressWarnings("unused")
			ByteBuffer byteBuffer = ByteBuffer.allocate(-1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// limit����Ϊ����
	public static void test1_1() {
		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		try {
			byteBuffer = (ByteBuffer) byteBuffer.limit(-1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// position����Ϊ����
	public static void test1_2() {
		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		try {
			byteBuffer = (ByteBuffer) byteBuffer.position(-1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// position���ܴ�����limit
	public static void test2() {
		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		byteBuffer.limit(2);
		try {
			byteBuffer.position(3);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// limit���ܴ�����capacity
	public static void test3() {
		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		try {
			byteBuffer.limit(100);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// ���������mark�����ڽ�position��limit����С�ڸ�mark��ֵʱ����mark������
	public static void test4() {

	}

	// ���δ������mark����ô����reset���׳�InvalidMarkException�쳣
	public static void test5() {
		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		try {
			byteBuffer.reset();
		} catch (InvalidMarkException e) {
			e.printStackTrace();
		}
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
