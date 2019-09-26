package com.redteamobile.darwin.dao;

import com.redteamobile.darwin.model.entity.ImsiTransaction;
import com.redteamobile.darwin.model.entity.TransactionCdrImsiHourSum;
import com.redteamobile.mis.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public class TransactionCdrImsiHourSumDao extends BaseDao<TransactionCdrImsiHourSum> {
    @Autowired
    @Qualifier("darwinJdbcTemplate")
    protected JdbcTemplate jdbcTemplate;

    @Override
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public List<TransactionCdrImsiHourSum> queryMany(TransactionCdrImsiHourSum transactionCdrImsiHourSum) throws Exception {
        return this.selectMany(transactionCdrImsiHourSum);
    }

    @Override
    protected Class<TransactionCdrImsiHourSum> getEntityClass() {
        return TransactionCdrImsiHourSum.class;
    }
}

