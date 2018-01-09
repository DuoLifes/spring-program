package com.spring.boot.mongodb.service;

import com.spring.boot.mongodb.Repository.PartnerRepository;
import com.spring.boot.mongodb.entiy.Partner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Hashtable;
import java.util.List;

/**
 * Create with com.spring.boot.mongodb.service
 *
 * @author zhangpeiyu
 * @version 2018/1/9 10:51
 */
@Service
public class PartnerService {

    private final static Logger logger = LoggerFactory.getLogger(PartnerService.class);

    @Resource
    private PartnerRepository repository;


    public Partner create(Partner partner) {
        return repository.insert(partner);
    }

    public Partner modify(Partner partner) {
        return repository.save(partner);
    }

    public void delete(String id) {
        repository.delete(id);
    }

    public Partner findItem(String id) {
        return repository.findOne(id);
    }

    public Page<Partner> findPage(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public List<Partner> findList(Pageable pageable) {
        return repository.findAll(pageable.getSort());
    }

    public Hashtable<String, String> findTokens() {
        Hashtable<String, String> dict = new Hashtable<>();
        repository.findAll().forEach(item -> dict.put(item.getId(), item.getToken()));
        return dict;
    }
}
