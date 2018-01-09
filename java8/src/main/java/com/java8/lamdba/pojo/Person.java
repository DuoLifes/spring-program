package com.java8.lamdba.pojo;

import java.util.Date;

/**
 * Create with com.java8.lamdba.pojo
 *
 * @author zhangpeiyu
 * @version 2018/1/3 16:12
 */
public class Person {
    public enum Sex{
        MALE,FEMALE
    }
    String name;
    Date birthday;
    Sex gender;
    String emailAddress;

    /**
     * Getter for property 'name'.
     *
     * @return Value for property 'name'.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for property 'name'.
     *
     * @param name Value to set for property 'name'.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for property 'birthday'.
     *
     * @return Value for property 'birthday'.
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Setter for property 'birthday'.
     *
     * @param birthday Value to set for property 'birthday'.
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * Getter for property 'gender'.
     *
     * @return Value for property 'gender'.
     */
    public Sex getGender() {
        return gender;
    }

    /**
     * Setter for property 'gender'.
     *
     * @param gender Value to set for property 'gender'.
     */
    public void setGender(Sex gender) {
        this.gender = gender;
    }

    /**
     * Getter for property 'emailAddress'.
     *
     * @return Value for property 'emailAddress'.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for property 'emailAddress'.
     *
     * @param emailAddress Value to set for property 'emailAddress'.
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static int compareByAge(Person a, Person b){
        return a.birthday.compareTo(b.birthday);
    }
}
