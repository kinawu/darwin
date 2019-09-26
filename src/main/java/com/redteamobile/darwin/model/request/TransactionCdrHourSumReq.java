package com.redteamobile.darwin.model.request;

import com.google.common.base.MoreObjects;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class TransactionCdrHourSumReq implements Serializable {

    private String transactionId;//no comment
    private String day;//no comment
    private String hour;//no comment
    private Long usage;//no comment

    public static TransactionCdrHourSumReq build() {
        return new TransactionCdrHourSumReq();
    }
    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }

    public String getTransactionId() {
        return transactionId;
    }

    public TransactionCdrHourSumReq setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public TransactionCdrHourSumReq setDay(String day) {
        this.day = day == null ? null : day.trim();
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public TransactionCdrHourSumReq setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
        return this;
    }
    public String getHour() {
        return this.hour;
    }

    public TransactionCdrHourSumReq setUsage(Long usage) {
        this.usage = usage;
        return this;
    }
    public Long getUsage() {
        return this.usage;
    }

}
