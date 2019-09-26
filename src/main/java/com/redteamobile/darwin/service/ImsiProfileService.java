package com.redteamobile.darwin.service;

import com.redteamobile.darwin.model.entity.ImsiProfile;

public interface ImsiProfileService {
    public ImsiProfile queryImsiProfileByImsi(String imsi) throws Exception;
}
