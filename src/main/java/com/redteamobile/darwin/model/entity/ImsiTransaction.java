package com.redteamobile.darwin.model.entity;

import com.google.common.base.MoreObjects;
import com.redteamobile.mis.BasePo;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class ImsiTransaction extends BasePo {

    private Integer imsiTransactionId;//no comment
    private String imsi;//no comment
    private String bundleId;//no comment
    private String status;//no comment
    private Date generateTime;//no comment
    private Date activateTime;//no comment
    private Date suspendTime;//no comment
    private Integer isLimited;//no comment
    private Integer extendCount;//no comment
    private Integer imsiProfileId;//no comment
    private Integer merchantId;//no comment
    private Integer isTest;//no comment
    private String orderId;
    private Integer parentTransactionId;
    private String code;
    private String parentCode;
    private String url;
    private String threshold;
    private String ac;

    public static ImsiTransaction build() {
        return new ImsiTransaction();
    }

    @Override public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public ImsiTransaction setImsiTransactionId(Integer imsiTransactionId) {
        this.imsiTransactionId = imsiTransactionId;
        return this;
    }

    public Integer getImsiTransactionId() {
        return this.imsiTransactionId;
    }

    public ImsiTransaction setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
        return this;
    }

    public String getImsi() {
        return this.imsi;
    }

    public ImsiTransaction setBundleId(String bundleId) {
        this.bundleId = bundleId == null ? null : bundleId.trim();
        return this;
    }

    public String getBundleId() {
        return this.bundleId;
    }

    public ImsiTransaction setStatus(String status) {
        this.status = status == null ? null : status.trim();
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ImsiTransaction setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
        return this;
    }

    public Date getGenerateTime() {
        return this.generateTime;
    }

    public ImsiTransaction setActivateTime(Date activateTime) {
        this.activateTime = activateTime;
        return this;
    }

    public Date getActivateTime() {
        return this.activateTime;
    }

    public ImsiTransaction setSuspendTime(Date suspendTime) {
        this.suspendTime = suspendTime;
        return this;
    }

    public Date getSuspendTime() {
        return this.suspendTime;
    }

    public ImsiTransaction setIsLimited(Integer isLimited) {
        this.isLimited = isLimited;
        return this;
    }

    public Integer getIsLimited() {
        return this.isLimited;
    }

    public ImsiTransaction setExtendCount(Integer extendCount) {
        this.extendCount = extendCount;
        return this;
    }

    public Integer getExtendCount() {
        return this.extendCount;
    }

    public ImsiTransaction setImsiProfileId(Integer imsiProfileId) {
        this.imsiProfileId = imsiProfileId;
        return this;
    }

    public Integer getImsiProfileId() {
        return this.imsiProfileId;
    }

    public ImsiTransaction setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    public Integer getMerchantId() {
        return this.merchantId;
    }

    public ImsiTransaction setIsTest(Integer isTest) {
        this.isTest = isTest;
        return this;
    }

    public Integer getIsTest() {
        return this.isTest;
    }

    public Integer getParentTransactionId() {
        return parentTransactionId;
    }

    public ImsiTransaction setParentTransactionId(Integer parentTransactionId) {
        this.parentTransactionId = parentTransactionId;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public ImsiTransaction setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ImsiTransaction setCode(String code) {
        this.code = code;
        return this;
    }

    public String getParentCode() {
        return parentCode;
    }

    public ImsiTransaction setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ImsiTransaction setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getThreshold() {
        return threshold;
    }

    public ImsiTransaction setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }

    public String getAc() {
        return ac;
    }

    public ImsiTransaction setAc(String ac) {
        this.ac = ac;
        return this;
    }
}

