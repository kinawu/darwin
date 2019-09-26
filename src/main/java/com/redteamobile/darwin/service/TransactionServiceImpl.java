package com.redteamobile.darwin.service;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.redteamobile.darwin.dao.TransactionCdrImsiHourSumDao;
import com.redteamobile.darwin.model.entity.ImsiProfile;
import com.redteamobile.darwin.model.entity.ImsiTransaction;
import com.redteamobile.darwin.model.entity.TransactionCdrImsiHourSum;
import com.redteamobile.darwin.model.request.TransactionCdrHourSumReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import play.libs.Json;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionCdrImsiHourSumDao transactionCdrImsiHourSumDao;
    @Autowired
    private MerchantService merchantService;

    private final Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class);
    @Override
    public ObjectNode getDailyUsage(ImsiProfile imsiProfile, ImsiTransaction transaction)
            throws Exception {
        ObjectNode result = Json.newObject();
        try {
            List<TransactionCdrImsiHourSum> list = transactionCdrImsiHourSumDao.selectMany(
                    TransactionCdrImsiHourSum.build()
                            .setTransactionId(transaction.getImsiTransactionId())
                            .setImsi(imsiProfile.getImsi())
            );

            ArrayNode array = result.putArray("cdrs");
            long total = 0L;
            list.stream().forEach(r -> array.add(Json.toJson(convertFromTransactionCdrHourSum(r))));
            total = list.stream().mapToLong(r -> r.getUsage()).reduce((a, b) -> a + b).orElse(0l);
            logger.debug("total usage for transaction {} is {}", transaction.getCode(), total);
            return result.put("success", true).put("total", total);
        } catch (Exception e) {
            logger.error("Error when query CDR for transaction {} of imsi {}.Caused by ",
                    transaction.getCode(), imsiProfile.getImsi(), e);
            throw e;
        }
    }

    private TransactionCdrHourSumReq convertFromTransactionCdrHourSum(TransactionCdrImsiHourSum t) {
        return TransactionCdrHourSumReq.build().setDay(String.valueOf(t.getDay())).setHour(
                t.getHour().intValue() < 10 ? "0" + t.getHour().intValue() : t.getHour() + "")
                .setTransactionId(t.getTransactionId().toString()).setUsage(t.getUsage());
    }
}
