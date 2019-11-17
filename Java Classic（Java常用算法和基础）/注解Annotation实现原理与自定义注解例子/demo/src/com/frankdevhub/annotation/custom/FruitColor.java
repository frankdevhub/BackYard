package com.frankdevhub.annotation.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: FruitColor
 * @author: frankdevhub@gmail.com
 * @date: 2019��11��17�� ����12:30:35
 * @description: ����ˮ����ɫ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
	public enum Color {
		RED, GREEN, ORANGE, BULE
	};

	Color fruitColor() default Color.RED;
}
