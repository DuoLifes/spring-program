package com.spring.boot.rest.api;

import com.spring.boot.interf.CustomerDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Create with com.spring.boot.rest.api
 *
 * @author zhangpeiyu
 * @version 2018/1/10 16:44
 */
@RestController
@RequestMapping("/api/test")
public class TestAPI {

    @GetMapping
    public Date test(@CustomerDate(value = "2017-12-31 12:51") Date date){

        return date;

    }
}
