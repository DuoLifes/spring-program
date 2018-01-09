package com.java8.lamdba;

import com.java8.lamdba.pojo.ComparisonProvider;
import com.java8.lamdba.pojo.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Create with com.java8.lamdba
 *
 * @author zhangpeiyu
 * @version 2018/1/3 16:17
 */
public class LamdbaDemo {
    static Person[] persons = new Person[10];
    static {

        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setBirthday(new Date());
            person.setEmailAddress("email地址"+i);
            person.setName("zpy"+i);
            persons[i] = person;
        }

    }
    /**
     * 引用静态方法
     */
    public static void referenceStaticMethod(){


        //使用匿名类
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                System.out.println("使用匿名类");
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        //使用lambda表达式
        Arrays.sort(persons, (o1, o2) -> {
            System.out.println("使用lambda表达式");
            return o1.getBirthday().compareTo(o2.getBirthday());
        });

        //使用lambda表达式和类的静态方法
        Arrays.sort(persons, (o1, o2) -> {
            System.out.println("使用lambda表达式和类的静态方法");
            return Person.compareByAge(o1,o2);
        });

        //使用方法引用
        //引用的是类的静态方法
        Arrays.sort(persons, Person::compareByAge);
    }

    /**
     * 引用对象的实例方法
     */
    public static void instanceMethodOfReference(){
        ComparisonProvider provider = new ComparisonProvider();

        //使用lambda表达式
        //对象的实例方法
        Arrays.sort(persons,(a,b)->provider.compareByAge(a,b));

        //使用方法引用
        //引用的是对象的实例方法
        Arrays.sort(persons, provider::compareByAge);
    }


    public static void main(String[] args) {
//        referenceStaticMethod();
//        instanceMethodOfReference();
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        System.out.println(concat);
        Optional<Integer> sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum);
        System.out.println(sumValue);
    }
}
