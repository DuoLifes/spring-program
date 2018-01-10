package com.spring.boot.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Create with com.spring.boot.config
 *
 * @author zhangpeiyu
 * @version 2018/1/10 17:15
 */
@Component
public class BeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println(o.toString());
        System.out.println(s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("===========================");
        System.out.println(o.toString());
        System.out.println(s);
        return o;
    }
}
