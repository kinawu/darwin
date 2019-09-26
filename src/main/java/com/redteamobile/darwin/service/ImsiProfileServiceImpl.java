package com.redteamobile.darwin.service;

import com.redteamobile.darwin.dao.ImsiProfileDao;
import com.redteamobile.darwin.model.entity.ImsiProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImsiProfileServiceImpl implements ImsiProfileService {
    @Autowired
    private ImsiProfileDao imsiProfileDao;

    @Override
    public ImsiProfile queryImsiProfileByImsi(String imsi) throws Exception {
        return imsiProfileDao.select(ImsiProfile.build().setImsi(imsi));
    }
}
