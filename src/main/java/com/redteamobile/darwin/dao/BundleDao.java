package com.redteamobile.darwin.dao;

import com.redteamobile.darwin.model.entity.Bundle;
import com.redteamobile.mis.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BundleDao extends BaseDao<Bundle> {

    @Override
    protected Class<Bundle> getEntityClass() {
        return Bundle.class;
    }
}
