package com.spring.boot.mongodb.entiy;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.UUID;

/**
 * Create with com.spring.boot.mongodb.entity
 *
 * @author zhangpeiyu
 * @version 2018/1/9 10:49
 */
@Document
public class Partner {

    /**
     * 唯一标识
     */
    @Id
    private String id;

    /**
     * 媒体编号
     */
    @Field
    private String mediaId;

    /**
     * 媒体名称
     */
    @Field
    private String name;

    /**
     * 媒体编码
     */
    @Field
    private String code;

    /**
     * 计算签名所需的密钥
     */
    @Field
    private String token;

    /**
     * 备注
     */
    @Field
    private String remark;

    /**
     * 是否失效
     */
    @Field
    private boolean invalid;

    /**
     * 更新时间
     */
    @Field
    private Date updateTime;


    /**
     * 默认实例化方法
     */
    public Partner() {
        setId(UUID.randomUUID().toString());
        setInvalid(false);
        setUpdateTime(new Date());
    }

    //region getter & setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean getInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    //endregion
}
