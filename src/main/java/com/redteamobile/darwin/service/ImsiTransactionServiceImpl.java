package com.redteamobile.darwin.service;

import com.redteamobile.darwin.dao.ImsiTransactionDao;
import com.redteamobile.darwin.model.entity.ImsiTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImsiTransactionServiceImpl implements ImsiTransactionService{
    @Autowired
    private ImsiTransactionDao imsiTransactionDao;

    public ImsiTransaction queryTransactionByCode(String code) throws Exception {
        return imsiTransactionDao.select(ImsiTransaction.build().setCode(code));
    }
}
