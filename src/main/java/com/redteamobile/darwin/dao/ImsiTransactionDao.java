package com.redteamobile.darwin.dao;

import com.redteamobile.darwin.model.entity.ImsiTransaction;
import com.redteamobile.mis.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class ImsiTransactionDao extends BaseDao<ImsiTransaction> {

    @Override
    protected Class<ImsiTransaction> getEntityClass() {
        return ImsiTransaction.class;
    }
}

