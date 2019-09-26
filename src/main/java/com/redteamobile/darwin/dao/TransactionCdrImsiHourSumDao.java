package com.redteamobile.darwin.dao;

import com.redteamobile.darwin.model.entity.TransactionCdrImsiHourSum;
import com.redteamobile.mis.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionCdrImsiHourSumDao extends BaseDao<TransactionCdrImsiHourSum> {
    @Autowired
    @Qualifier("darwinJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Override
    protected Class<TransactionCdrImsiHourSum> getEntityClass() {
        return TransactionCdrImsiHourSum.class;
    }
}

