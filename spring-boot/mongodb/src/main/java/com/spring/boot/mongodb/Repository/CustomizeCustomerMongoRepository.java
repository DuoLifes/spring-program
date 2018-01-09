package com.spring.boot.mongodb.Repository;

import com.spring.boot.mongodb.entiy.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Create with com.spring.boot.mongodb.Repository
 * 自定义方式实现储存操作类
 * @author zhangpeiyu
 * @version 2018/1/9 09:46
 */
@Repository
public class CustomizeCustomerMongoRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * 保存一个对象
     *
     * @return
     */
    public Partner save(Partner customer) {
        mongoTemplate.save(customer);
        return customer;
    }

    /**
     * 删除所有
     */
    public void deleteAll() {
        mongoTemplate.dropCollection(Partner.class);
    }

    /**
     * 查询所有
     *
     * @return
     */
    public List<Partner> findAll() {
        return mongoTemplate.findAll(Partner.class);
    }

    /**
     * 精确查询
     *
     * @param firstName
     * @return
     */
    public List<Partner> findByFirstName(String firstName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").is(firstName));

        return mongoTemplate.find(query, Partner.class);
    }

    /**
     * 模糊查询不区分大小写
     *
     * @param lastName
     * @return
     */
    public List<Partner> findByLastName(String lastName) {
        Query query = new Query();
        Pattern pattern = Pattern.compile("^.*" + lastName + ".*$", Pattern.CASE_INSENSITIVE);// Pattern.CASE_INSENSITIVE不区分大小写
        query.addCriteria(Criteria.where("lastName").regex(pattern));
        return mongoTemplate.find(query, Partner.class);
    }
}
