package com.spring.jpa.repository;

import com.spring.jpa.entity.Persion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create with com.spring.jpa.repsotory
 *
 * @author zhangpeiyu
 * @version 2018/1/9 20:26
 */
@Repository
public interface PersionReponsitory extends JpaRepository<Persion,String> {

}
