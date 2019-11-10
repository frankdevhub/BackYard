package com.frankdevhub.foo.chp1;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/**
 * @ClassName: BufferTest5
 * @author: frankdevhub@gmail.com
 * @date: 2019年11月10日 下午1:52:34
 * @description: 使用Buffer mark()方法处理标记
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class BufferTest5 {

	// 缓冲区的capacity不能为负数，缓冲和区的limit不能为负数，缓冲区的position不能为负数
	// capacity不能为负数
	public static void test1() {
		try {
			@SuppressWarnings("unused")
			ByteBuffer byteBuffer = ByteBuffer.allocate(-1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// limit不能为负数
	public static void test1_1() {
		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		try {
			byteBuffer = (ByteBuffer) byteBuffer.limit(-1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// position不能为负数
	public static void test1_2() {
		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		try {
			byteBuffer = (ByteBuffer) byteBuffer.position(-1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// position不能大于其limit
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

	// limit不能大于其capacity
	public static void test3() {
		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		try {
			byteBuffer.limit(100);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	// 如果定义了mark，则在将position或limit调整小于该mark的值时，该mark被丢弃
	public static void test4() {

	}

	// 如果未定义了mark，那么调用reset会抛出InvalidMarkException异常
	public static void test5() {
		byte[] byteArray = new byte[] { 1, 2, 3 };
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		try {
			byteBuffer.reset();
		} catch (InvalidMarkException e) {
			e.printStackTrace();
		}
	}

	// 如果position大于新的limit，则position的值就是新limit的值
	public static void test6() {

	}

	// 当position和limit值一样时，在指定的position写入数据会出现异常，因为此位置是被限制的
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
