package com.java8.lamdba.pojo;

/**
 * Create with com.java8.lamdba.pojo
 *
 * @author zhangpeiyu
 * @version 2018/1/3 16:55
 */
public class ComparisonProvider{
    public int compareByName(Person a,Person b){
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Person a,Person b){
        return a.getBirthday().compareTo(b.getBirthday());
    }
}