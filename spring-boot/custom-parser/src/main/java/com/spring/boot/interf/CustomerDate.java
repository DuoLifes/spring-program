package com.spring.boot.interf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Create with com.spring.boot.interf
 *
 * @author zhangpeiyu
 * @version 2018/1/10 16:52
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface CustomerDate {
    String value();
}

