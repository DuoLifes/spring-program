package com.spring.boot.mongodb.api;

import com.spring.boot.mongodb.entiy.Partner;
import com.spring.boot.mongodb.service.PartnerService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Hashtable;
import java.util.List;

/**
 * Create with com.spring.boot.mongodb.api
 *
 * @author zhangpeiyu
 * @version 2018/1/9 10:48
 */
@RequestMapping("/api/partner")
@RestController
public class PartnerAPI {

    @Resource
    private PartnerService service;

    @PostMapping
    public Partner create(@RequestBody Partner partner) {
        return service.create(partner);
    }

    @PutMapping
    public Partner modify(@RequestBody Partner partner) {
        return service.modify(partner);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public Partner findItem(@PathVariable String id) {
         Partner p = service.findItem(id);
        return p;
    }

    @GetMapping("/list")
    public List<Partner> findList(@PageableDefault(value = 20, sort = {"name"}) Pageable pageable) {
        List<Partner> list = service.findList(pageable);
        return list;
    }

    @GetMapping("/dict")
    public Hashtable<String, String> findTokens() {
        return service.findTokens();
    }

}
