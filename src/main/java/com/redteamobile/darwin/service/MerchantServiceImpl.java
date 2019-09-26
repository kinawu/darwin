package com.redteamobile.darwin.service;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.redteamobile.darwin.dao.MerchantDao;
import com.redteamobile.darwin.model.entity.Merchant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class MerchantServiceImpl implements MerchantService {
    private final Logger LOG = LoggerFactory.getLogger(MerchantServiceImpl.class);
    @Autowired
    private MerchantDao merchantDao;
    @Override
    public Merchant getMerchantByCode(String code) throws Exception {
        Merchant m = merchantDao.select(Merchant.build().setCode(code).setStatus("ACTIVE"));
        //通过guava缓存获取merchant
        LOG.info("Got merchant {} by code {} ", m, code);
        return m;
    }
}
