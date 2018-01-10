package com.spring.boot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Create with com.spring.boot.entity
 *
 * @author zhangpeiyu
 * @version 2018/1/10 09:41
 */
@Data
public class Author implements Serializable {
    /**
     * 作者id
     */
    private Long id;
    /**
     * 作者姓名
     */
    private String name;
    /**
     * 作者简介
     */
    private String remark;
}
