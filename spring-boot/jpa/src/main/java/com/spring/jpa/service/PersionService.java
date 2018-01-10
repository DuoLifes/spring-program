package com.spring.jpa.service;

import com.spring.jpa.entity.Persion;
import com.spring.jpa.repository.PersionReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Create with com.spring.jpa.service
 *
 * @author zhangpeiyu
 * @version 2018/1/9 20:29
 */
@Service
public class PersionService {

    @Autowired
    private PersionReponsitory persionReponsitory;

    public Persion create(Persion persion){
        return persionReponsitory.saveAndFlush(persion);
    }

    public Page<Persion> findPage(Pageable pageable){
        return persionReponsitory.findAll(pageable);
    }
}
