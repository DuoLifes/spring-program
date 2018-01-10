package com.spring.boot.parser;

import com.spring.boot.interf.CustomerDate;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create with com.spring.boot.parser
 *
 * @author zhangpeiyu
 * @version 2018/1/10 16:45
 */
@Component
public class CustonHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        Class clz = parameter.getParameterType();
        return clz.equals(Date.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        Annotation[]  methodAnnotations= parameter.getParameterAnnotations();
        for(Annotation  annotation:methodAnnotations){
            if(annotation instanceof CustomerDate){
                CustomerDate  customerDate=(CustomerDate)annotation;
                String dataStringValue=customerDate.value();
                SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd HH:mm");
                return  formater.parse(dataStringValue);
            }
        }
        return null;
    }
}
