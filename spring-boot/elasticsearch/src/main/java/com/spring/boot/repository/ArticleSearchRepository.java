package com.spring.boot.repository;

import com.spring.boot.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * Create with com.spring.boot.repository
 *
 * @author zhangpeiyu
 * @version 2018/1/10 09:44
 */
@Repository
public interface ArticleSearchRepository extends ElasticsearchRepository<Article,Long> {
}
