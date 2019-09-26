package com.redteamobile.darwin.service;

import com.google.inject.ImplementedBy;
import com.redteamobile.darwin.dao.MerchantDao;
import com.redteamobile.darwin.model.entity.Merchant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

public interface MerchantService {
    Merchant getMerchantByCode(String code) throws Exception;
}
