package com.spring.boot.mongodb.entiy;

import com.spring.boot.mongodb.interf.AutoValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Create with com.spring.boot.mongodb.entiy
 *
 * @author zhangpeiyu
 * @version 2018/1/9 10:36
 */
@Document
public class Student {
    @AutoValue
    @Id
    private long id;
    private String name;

    public Student(String name) {
        super();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
