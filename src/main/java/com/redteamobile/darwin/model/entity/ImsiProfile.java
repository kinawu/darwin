package com.redteamobile.darwin.model.entity;

import com.redteamobile.mis.BasePo;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class ImsiProfile  extends BasePo {

    private Integer imsiProfileId;//no comment
    private String iccid;//no comment
    private String imsi;//no comment
    private String efki;//no comment
    private String efopc;//no comment
    private String msisdn;//no comment
    private Integer carrierId;//no comment
    private String whereToUse;//no comment
    private Boolean isTest;//no comment
    private Boolean reusable;//no comment
    private String remark;//no comment
    private Boolean allocated;//no comment
    private Boolean activated;//no comment
    private Integer merchantId;//no comment
    private Date lastActivatedTime;//no comment
    private Integer imsiType;//no comment
    private String batchId;//no comment
    private Boolean hasCsim;//no comment
    private Integer bundleGroupId;//no comment
    private String allocationCode;//no comment

    public static ImsiProfile build() {
        return new ImsiProfile();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public ImsiProfile setImsiProfileId(Integer imsiProfileId) {
        this.imsiProfileId = imsiProfileId;
        return this;
    }

    public Integer getImsiProfileId() {
        return this.imsiProfileId;
    }

    public ImsiProfile setIccid(String iccid) {
        this.iccid = iccid == null ? null : iccid.trim();
        return this;
    }

    public String getIccid() {
        return this.iccid;
    }

    public ImsiProfile setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
        return this;
    }

    public String getImsi() {
        return this.imsi;
    }

    public ImsiProfile setEfki(String efki) {
        this.efki = efki == null ? null : efki.trim();
        return this;
    }

    public String getEfki() {
        return this.efki;
    }

    public ImsiProfile setEfopc(String efopc) {
        this.efopc = efopc == null ? null : efopc.trim();
        return this;
    }

    public String getEfopc() {
        return this.efopc;
    }

    public ImsiProfile setMsisdn(String msisdn) {
        this.msisdn = msisdn == null ? null : msisdn.trim();
        return this;
    }

    public String getMsisdn() {
        return this.msisdn;
    }

    public ImsiProfile setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
        return this;
    }

    public Integer getCarrierId() {
        return this.carrierId;
    }

    public ImsiProfile setWhereToUse(String whereToUse) {
        this.whereToUse = whereToUse == null ? null : whereToUse.trim();
        return this;
    }

    public String getWhereToUse() {
        return this.whereToUse;
    }

    public ImsiProfile setIsTest(Boolean isTest) {
        this.isTest = isTest;
        return this;
    }

    public Boolean getIsTest() {
        return this.isTest;
    }

    public ImsiProfile setReusable(Boolean reusable) {
        this.reusable = reusable;
        return this;
    }

    public Boolean getReusable() {
        return this.reusable;
    }

    public ImsiProfile setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public ImsiProfile setAllocated(Boolean allocated) {
        this.allocated = allocated;
        return this;
    }

    public Boolean getAllocated() {
        return this.allocated;
    }

    public ImsiProfile setActivated(Boolean activated) {
        this.activated = activated;
        return this;
    }

    public Boolean getActivated() {
        return this.activated;
    }

    public ImsiProfile setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    public Integer getMerchantId() {
        return this.merchantId;
    }

    public ImsiProfile setLastActivatedTime(Date lastActivatedTime) {
        this.lastActivatedTime = lastActivatedTime;
        return this;
    }

    public Date getLastActivatedTime() {
        return this.lastActivatedTime;
    }

    public ImsiProfile setImsiType(Integer imsiType) {
        this.imsiType = imsiType;
        return this;
    }

    public Integer getImsiType() {
        return this.imsiType;
    }

    public ImsiProfile setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
        return this;
    }

    public String getBatchId() {
        return this.batchId;
    }

    public ImsiProfile setHasCsim(Boolean hasCsim) {
        this.hasCsim = hasCsim;
        return this;
    }

    public Boolean getHasCsim() {
        return this.hasCsim;
    }

    public ImsiProfile setBundleGroupId(Integer bundleGroupId) {
        this.bundleGroupId = bundleGroupId;
        return this;
    }

    public Integer getBundleGroupId() {
        return this.bundleGroupId;
    }

    public ImsiProfile setAllocationCode(String allocationCode) {
        this.allocationCode = allocationCode == null ? null : allocationCode.trim();
        return this;
    }

    public String getAllocationCode() {
        return this.allocationCode;
    }

    public enum ImsiType {
        PREPAY(1), STANDARD(2);

        private int type;

        ImsiType(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }
    }
}
