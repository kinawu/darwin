package com.redteamobile.darwin.model.entity;

import com.google.common.base.MoreObjects;
import com.redteamobile.mis.BasePo;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class TransactionCdrImsiDaySum extends BasePo {

    private Integer transactionId;//no comment
    private String imsi;//no comment
    private Integer day;//no comment
    private Integer merchantId;//no comment
    private String locationCode;//no comment
    private String country;//no comment
    private String carrier;//no comment
    private String bundleId;//no comment
    private Long usage;//no comment

    public static TransactionCdrImsiDaySum build() {
        return new TransactionCdrImsiDaySum();
    }
    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }

    public TransactionCdrImsiDaySum setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public Integer getTransactionId() {
        return this.transactionId;
    }

    public TransactionCdrImsiDaySum setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
        return this;
    }
    public String getImsi() {
        return this.imsi;
    }

    public TransactionCdrImsiDaySum setDay(Integer day) {
        this.day = day;
        return this;
    }
    public Integer getDay() {
        return this.day;
    }

    public TransactionCdrImsiDaySum setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public Integer getMerchantId() {
        return this.merchantId;
    }

    public TransactionCdrImsiDaySum setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
        return this;
    }
    public String getLocationCode() {
        return this.locationCode;
    }

    public TransactionCdrImsiDaySum setCountry(String country) {
        this.country = country == null ? null : country.trim();
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public TransactionCdrImsiDaySum setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public TransactionCdrImsiDaySum setBundleId(String bundleId) {
        this.bundleId = bundleId == null ? null : bundleId.trim();
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public TransactionCdrImsiDaySum setUsage(Long usage) {
        this.usage = usage;
        return this;
    }
    public Long getUsage() {
        return this.usage;
    }

}