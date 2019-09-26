package com.redteamobile.darwin.model.entity;

import com.google.common.base.MoreObjects;
import com.redteamobile.mis.BasePo;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Bundle extends BasePo {

    private Integer id;//no comment
    private String bundleType;//no comment
    private String status;//no comment
    private String code;//no comment
    private Integer carrierId;//no comment
    private String location;//no comment
    private String description;//no comment
    private Integer dataVolume;//no comment
    private Integer dailyLimit;//no comment
    private Integer duration;//no comment
    private Boolean extensible;//no comment
    private String plmns;//no comment
    private String fplmns;//no comment
    private String configuration;//no comment
    private Boolean needQosControl;//no comment
    private String apn;//no comment
    private String hplmns;//no comment
    private String mcc;//no comment
    private Integer rat;//no comment
    private Integer size;//no comment
    private Integer getResourceMethod;//no comment
    private String rplmn;
    private String oplmns;
    private String hplmn;
    private String version;
    private String smsp;

    public static Bundle build() {
        return new Bundle();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Bundle setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public Bundle setBundleType(String bundleType) {
        this.bundleType = bundleType == null ? null : bundleType.trim();
        return this;
    }

    public String getBundleType() {
        return this.bundleType;
    }

    public Bundle setStatus(String status) {
        this.status = status == null ? null : status.trim();
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Bundle setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
        return this;
    }

    public Integer getCarrierId() {
        return this.carrierId;
    }

    public Bundle setLocation(String location) {
        this.location = location == null ? null : location.trim();
        return this;
    }

    public String getLocation() {
        return this.location;
    }

    public Bundle setDescription(String description) {
        this.description = description == null ? null : description.trim();
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Bundle setDataVolume(Integer dataVolume) {
        this.dataVolume = dataVolume;
        return this;
    }

    public Integer getDataVolume() {
        return this.dataVolume;
    }

    public Bundle setDailyLimit(Integer dailyLimit) {
        this.dailyLimit = dailyLimit;
        return this;
    }

    public Integer getDailyLimit() {
        return this.dailyLimit;
    }

    public Bundle setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public Bundle setExtensible(Boolean extensible) {
        this.extensible = extensible;
        return this;
    }

    public Boolean getExtensible() {
        return this.extensible;
    }

    public Bundle setPlmns(String plmns) {
        this.plmns = plmns == null ? null : plmns.trim();
        return this;
    }

    public String getPlmns() {
        return this.plmns;
    }

    public Bundle setFplmns(String fplmns) {
        this.fplmns = fplmns == null ? null : fplmns.trim();
        return this;
    }

    public String getFplmns() {
        return this.fplmns;
    }

    public Bundle setConfiguration(String configuration) {
        this.configuration = configuration == null ? null : configuration.trim();
        return this;
    }

    public String getConfiguration() {
        return this.configuration;
    }

    public Bundle setNeedQosControl(Boolean needQosControl) {
        this.needQosControl = needQosControl;
        return this;
    }

    public Boolean getNeedQosControl() {
        return this.needQosControl;
    }

    public Bundle setApn(String apn) {
        this.apn = apn == null ? null : apn.trim();
        return this;
    }

    public String getApn() {
        return this.apn;
    }

    public Bundle setHplmns(String hplmns) {
        this.hplmns = hplmns == null ? null : hplmns.trim();
        return this;
    }

    public String getHplmns() {
        return this.hplmns;
    }

    public Bundle setMcc(String mcc) {
        this.mcc = mcc == null ? null : mcc.trim();
        return this;
    }

    public String getMcc() {
        return this.mcc;
    }

    public Bundle setRat(Integer rat) {
        this.rat = rat;
        return this;
    }

    public Integer getRat() {
        return this.rat;
    }

    public Bundle setSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getSize() {
        return this.size;
    }

    public Integer getGetResourceMethod() {
        return getResourceMethod;
    }

    public Bundle setGetResourceMethod(Integer getResourceMethod) {
        this.getResourceMethod = getResourceMethod;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Bundle setCode(String code) {
        this.code = code;
        return this;
    }

    public String getRplmn() {
        return rplmn;
    }

    public Bundle setRplmn(String rplmn) {
        this.rplmn = rplmn;
        return this;
    }

    public String getOplmns() {
        return oplmns;
    }

    public String getHplmn() {
        return hplmn;
    }

    public Bundle setHplmn(String hplmn) {
        this.hplmn = hplmn;
        return this;
    }

    public Bundle setOplmns(String oplmns) {
        this.oplmns = oplmns;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Bundle setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getSmsp() {
        return smsp;
    }

    public Bundle setSmsp(String smsp) {
        this.smsp = smsp;
        return this;
    }
}

