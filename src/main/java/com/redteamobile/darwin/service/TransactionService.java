package com.redteamobile.darwin.service;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.redteamobile.darwin.model.entity.ImsiProfile;
import com.redteamobile.darwin.model.entity.ImsiTransaction;

public interface TransactionService {
    ObjectNode getDailyUsage(ImsiProfile imsiProfile, ImsiTransaction transaction) throws Exception;

}
