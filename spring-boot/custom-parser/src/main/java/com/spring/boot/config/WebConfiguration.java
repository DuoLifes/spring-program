package com.spring.boot.config;

import com.spring.boot.parser.CustonHandlerMethodArgumentResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Create with com.spring.boot.config
 *
 * @author zhangpeiyu
 * @version 2018/1/10 17:04
 */
@Component
public class WebConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(new CustonHandlerMethodArgumentResolver());
    }
}
