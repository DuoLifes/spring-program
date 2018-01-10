package com.spring.boot.rest.api;

import com.spring.boot.entity.Article;
import com.spring.boot.entity.Author;
import com.spring.boot.entity.Tutorial;
import com.spring.boot.repository.ArticleSearchRepository;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Create with com.spring.boot.rest.api
 *
 * @author zhangpeiyu
 * @version 2018/1/10 09:46
 */
@RestController
@RequestMapping("/api/article")
public class ArticleAPI {

    @Autowired
    private ArticleSearchRepository articleSearchRepository;

    @PostMapping
    public void create() {
        Author author = new Author();
        author.setId(1L);
        author.setName("tianshouzhi");
        author.setRemark("java developer");

        Tutorial tutorial = new Tutorial();
        tutorial.setId(1L);
        tutorial.setName("elastic search");

        Article article = new Article();
        article.setId(1L);
        article.setTitle("springboot integreate elasticsearch");
        article.setAbstracts("springboot integreate elasticsearch is very easy");
        article.setTutorial(tutorial);
        article.setAuthor(author);
        article.setContent("elasticsearch based on lucene,"
                + "spring-data-elastichsearch based on elaticsearch"
                + ",this tutorial tell you how to integrete springboot with spring-data-elasticsearch");
        article.setPostTime(new Date());
        article.setClickCount(1L);

        articleSearchRepository.save(article);
    }

    @GetMapping
    public List<Article> searchKeyword() {
        String queryString = "springboot";//搜索关键字
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
        Iterable<Article> searchResult = articleSearchRepository.search(builder);
        Iterator<Article> iterator = searchResult.iterator();
        List<Article> articles = new ArrayList<>();
        while (iterator.hasNext()) {
            articles.add(iterator.next());
        }
        return articles;
    }
}
