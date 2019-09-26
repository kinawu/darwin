package com.redteamobile.darwin.service;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.redteamobile.darwin.dao.BundleDao;
import com.redteamobile.darwin.dao.MerchantDao;
import com.redteamobile.darwin.model.entity.Bundle;
import com.redteamobile.darwin.util.MessageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import play.libs.Json;

import java.util.List;

@Service
public class BundleServiceImpl implements BundleService {
    private final Logger LOG = LoggerFactory.getLogger(BundleServiceImpl.class);

    @Autowired
    private BundleDao bundleDao;

    @Override public Bundle getBundleByCode(String code) throws Exception {
        Bundle b = bundleDao.select(Bundle.build().setCode(code).setStatus("ACTIVE").withCache());
        LOG.info("Got bundle {} by given bundle id {}", b, code);
        return b;
    }


}
