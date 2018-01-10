package com.spring.jpa.entity;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;

/**
 * Create with com.spring.jpa.entity
 *
 * @author zhangpeiyu
 * @version 2018/1/9 20:20
 */
@Entity
public class Persion {

    @Id
    private String PersionId;

    @Column(name = "persion_name")
    private String persionName;

    @Column(name = "persion_age")
    private int persionAge;

    @ManyToOne(targetEntity = Province.class)
    @JoinColumn(name = "province_id")
    @Cascade(CascadeType.ALL)
    private Province province;

    /**
     * Getter for property 'persionId'.
     *
     * @return Value for property 'persionId'.
     */
    public String getPersionId() {
        return PersionId;
    }

    /**
     * Setter for property 'persionId'.
     *
     * @param persionId Value to set for property 'persionId'.
     */
    public void setPersionId(String persionId) {
        PersionId = persionId;
    }

    /**
     * Getter for property 'persionName'.
     *
     * @return Value for property 'persionName'.
     */
    public String getPersionName() {
        return persionName;
    }

    /**
     * Setter for property 'persionName'.
     *
     * @param persionName Value to set for property 'persionName'.
     */
    public void setPersionName(String persionName) {
        this.persionName = persionName;
    }

    /**
     * Getter for property 'persionAge'.
     *
     * @return Value for property 'persionAge'.
     */
    public int getPersionAge() {
        return persionAge;
    }

    /**
     * Setter for property 'persionAge'.
     *
     * @param persionAge Value to set for property 'persionAge'.
     */
    public void setPersionAge(int persionAge) {
        this.persionAge = persionAge;
    }

    /**
     * Getter for property 'province'.
     *
     * @return Value for property 'province'.
     */
    public Province getProvince() {
        return province;
    }

    /**
     * Setter for property 'province'.
     *
     * @param province Value to set for property 'province'.
     */
    public void setProvince(Province province) {
        this.province = province;
    }
}
