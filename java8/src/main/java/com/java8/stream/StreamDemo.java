package com.java8.stream;


import java.util.stream.Stream;

/**
 * Create with com.java8.stream
 *
 * @author zhangpeiyu
 * @version 2018/1/3 15:23
 */
public class StreamDemo {


    public static void main(String[] args) {

        Stream stream = Stream.of("a", "b", "c");
        stream.map(v -> v+"c").forEach(m -> System.out.println(m));
    }
}
