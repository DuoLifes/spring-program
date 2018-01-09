package com.spring.boot.mongodb.interf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Create with com.spring.boot.mongodb.interf
 *
 * @author zhangpeiyu
 * @version 2018/1/9 10:35
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface AutoValue {

}