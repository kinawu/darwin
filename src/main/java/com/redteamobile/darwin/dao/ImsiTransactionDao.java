package com.redteamobile.darwin.dao;

import com.redteamobile.darwin.model.entity.ImsiTransaction;
import com.redteamobile.mis.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ImsiTransactionDao extends BaseDao<ImsiTransaction> {

    @Override
    protected Class<ImsiTransaction> getEntityClass() {
        return ImsiTransaction.class;
    }
}

