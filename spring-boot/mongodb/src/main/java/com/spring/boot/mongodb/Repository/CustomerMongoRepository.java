package com.spring.boot.mongodb.Repository;

import com.spring.boot.mongodb.entiy.Partner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Create with com.spring.boot.mongodb.Repository
 * 简单存储操作类
 * @author zhangpeiyu
 * @version 2018/1/9 09:40
 */
@Repository
public interface CustomerMongoRepository extends MongoRepository<Partner, String> {


}
