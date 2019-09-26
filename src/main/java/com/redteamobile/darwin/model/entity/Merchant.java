package com.redteamobile.darwin.model.entity;

import com.google.common.base.MoreObjects;
import com.redteamobile.mis.BasePo;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Merchant extends BasePo {

    private Integer id;//no comment
    private String code;//no comment
    private String name;//no comment
    private String status;//no comment
    private String accessKey;//no comment
    private String secretKey;//no comment

    public static Merchant build() {
        return new Merchant();
    }
    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }

    public Merchant setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public Merchant setCode(String code) {
        this.code = code == null ? null : code.trim();
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Merchant setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Merchant setStatus(String status) {
        this.status = status == null ? null : status.trim();
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Merchant setAccessKey(String accessKey) {
        this.accessKey = accessKey == null ? null : accessKey.trim();
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public Merchant setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

}
