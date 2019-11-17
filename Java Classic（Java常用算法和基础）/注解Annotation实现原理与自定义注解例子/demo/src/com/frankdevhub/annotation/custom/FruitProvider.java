package com.frankdevhub.annotation.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: FruitProvider
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��17�� ����12:30:55
 * @description: ����ˮ��������
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {
	String id() default "-1";

	String name() default "";

	String address() default "";
}
