package com.spring.boot.mongodb.Repository;

import com.spring.boot.mongodb.entiy.Partner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Create with com.spring.boot.mongodb.Repository
 *
 * @author zhangpeiyu
 * @version 2018/1/9 10:53
 */
@Repository
public interface PartnerRepository extends MongoRepository<Partner ,String> {

}
