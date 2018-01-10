package com.spring.jpa.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Create with com.spring.jpa.entity
 * 省份
 * @author zhangpeiyu
 * @version 2018/1/9 20:21
 */
@Entity
@Table(name = "province")
public class Province {

    @Id
    private String provinceId;

    @Column(name = "province_name")
    private String provinceName;

    @OneToMany
    List<Persion> persionList;

    /**
     * Getter for property 'provinceId'.
     *
     * @return Value for property 'provinceId'.
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * Setter for property 'provinceId'.
     *
     * @param provinceId Value to set for property 'provinceId'.
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * Getter for property 'provinceName'.
     *
     * @return Value for property 'provinceName'.
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Setter for property 'provinceName'.
     *
     * @param provinceName Value to set for property 'provinceName'.
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * Getter for property 'persionList'.
     *
     * @return Value for property 'persionList'.
     */
    public List<Persion> getPersionList() {
        return persionList;
    }

    /**
     * Setter for property 'persionList'.
     *
     * @param persionList Value to set for property 'persionList'.
     */
    public void setPersionList(List<Persion> persionList) {
        this.persionList = persionList;
    }
}