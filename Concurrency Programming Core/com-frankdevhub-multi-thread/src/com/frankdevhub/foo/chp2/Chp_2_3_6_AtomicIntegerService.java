package com.frankdevhub.foo.chp2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName: Chp_2_3_6_AtomicIntegerService
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��16�� ����5:57:02
 * @description: ԭ����Ҳ������ȫ��ȫ:�����뷽��֮��ĵ����п���˳�����
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */

public class Chp_2_3_6_AtomicIntegerService {
	// �˴�����޸�Ϊ
	// static AtomicLong aiRef = new AtomicLong(0L);
	// ���Ա���ԭ���Ժͷ������þ������������

	public static AtomicLong aiRef = new AtomicLong(0L);

	public long getValue() {
		return aiRef.get();
	}

	synchronized public void addNum() {
		System.out.println(
				"threadName=" + Thread.currentThread().getName() 
				+ " add 100 return value=" + aiRef.addAndGet(100));

		aiRef.addAndGet(1);
	}
}
