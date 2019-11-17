package com.frankdevhub.annotation.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: FruitName
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��17�� ����12:26:14
 * @description: ˮ������ע��
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitName {

	String value() default "";
}
