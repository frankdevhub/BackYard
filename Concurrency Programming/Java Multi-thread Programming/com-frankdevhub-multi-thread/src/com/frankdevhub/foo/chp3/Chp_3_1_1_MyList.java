package com.frankdevhub.foo.chp3;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Chp_3_1_1_MyList
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��6�� ����9:00:32
 * @description: ��ʹ�õȴ�/֪ͨ����ʵ���̼߳�ͨ��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp_3_1_1_MyList {

	private List<Object> list = new ArrayList<Object>();

	public void add() {
		list.add("frankdevhub@gmail.com");
	}

	public int getSize() {
		return list.size();
	}
}
