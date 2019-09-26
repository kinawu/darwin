package com.redteamobile.darwin.config;

import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "darwin.system")
public class CustomResource {
    private int webServiceTimeout = 5000;
    private int authRequestTime = 600;
    private  String adminAccessKey;
    private  String adminSecretkey;

    private String fareastoneOffersTemplate;
    private String fareastoneStatusTemplate;

    public int getWebServiceTimeout() {
        return webServiceTimeout;
    }

    public CustomResource setWebServiceTimeout(int webServiceTimeout) {
        this.webServiceTimeout = webServiceTimeout;
        return this;
    }

    public int getAuthRequestTime() {
        return authRequestTime;
    }

    public CustomResource setAuthRequestTime(int authRequestTime) {
        this.authRequestTime = authRequestTime;
        return this;
    }

    public String getAdminAccessKey() {
        return adminAccessKey;
    }

    public CustomResource setAdminAccessKey(String adminAccessKey) {
        this.adminAccessKey = adminAccessKey;
        return this;
    }

    public String getAdminSecretkey() {
        return adminSecretkey;
    }

    public CustomResource setAdminSecretkey(String adminSecretkey) {
        this.adminSecretkey = adminSecretkey;
        return this;
    }

    public String getFareastoneOffersTemplate() {
        return fareastoneOffersTemplate;
    }

    public CustomResource setFareastoneOffersTemplate(String fareastoneOffersTemplate) {
        this.fareastoneOffersTemplate = fareastoneOffersTemplate;
        return this;
    }

    public String getFareastoneStatusTemplate() {
        return fareastoneStatusTemplate;
    }

    public CustomResource setFareastoneStatusTemplate(String fareastoneStatusTemplate) {
        this.fareastoneStatusTemplate = fareastoneStatusTemplate;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
