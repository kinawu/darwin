package com.redteamobile.darwin.dao;

import com.redteamobile.darwin.model.entity.ImsiProfile;
import com.redteamobile.mis.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ImsiProfileDao extends BaseDao<ImsiProfile> {
    @Override
    protected Class<ImsiProfile> getEntityClass() {
        return ImsiProfile.class;
    }
}
