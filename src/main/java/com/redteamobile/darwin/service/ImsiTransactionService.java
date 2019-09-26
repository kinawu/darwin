package com.redteamobile.darwin.service;

import com.redteamobile.darwin.dao.ImsiTransactionDao;
import com.redteamobile.darwin.model.entity.ImsiTransaction;
import org.springframework.beans.factory.annotation.Autowired;

public interface ImsiTransactionService {
    ImsiTransaction queryTransactionByCode(String code) throws Exception;
}
