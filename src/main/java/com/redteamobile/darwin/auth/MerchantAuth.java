package com.redteamobile.darwin.auth;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.redteamobile.darwin.model.entity.Merchant;
import com.redteamobile.darwin.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MerchantAuth extends Authenticator {

    @Autowired
    private MerchantService merchantService;

    @Override
    protected Map<String, String> getKeyPairs(String merchantCode) {
        try {
            Merchant merchant = merchantService.getMerchantByCode(merchantCode);
            return ImmutableMap.of(merchant.getAccessKey(), merchant.getSecretKey());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Maps.newHashMap();
    }

}