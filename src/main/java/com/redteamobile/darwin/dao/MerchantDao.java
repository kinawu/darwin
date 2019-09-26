package com.redteamobile.darwin.dao;

import com.redteamobile.darwin.model.entity.Merchant;
import com.redteamobile.mis.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao extends BaseDao<Merchant> {
    @Override
    protected Class<Merchant> getEntityClass() {
        return Merchant.class;
    }
}
