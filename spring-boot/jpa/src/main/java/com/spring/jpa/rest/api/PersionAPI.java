package com.spring.jpa.rest.api;

import com.spring.jpa.entity.Persion;
import com.spring.jpa.service.PersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with com.spring.jpa.rest.api
 *
 * @author zhangpeiyu
 * @version 2018/1/9 20:28
 */
@RestController
@RequestMapping("api/persion")
public class PersionAPI {

    @Autowired
    private PersionService persionService;


    public Persion create(Persion persion){
        Persion p = persionService.create(persion);
        return p;
    }

    public Page<Persion> findPage(Pageable pageable){
        Page<Persion> page = persionService.findPage(pageable);
        return page;
    }
}
