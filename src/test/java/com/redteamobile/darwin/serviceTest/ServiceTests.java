package com.redteamobile.darwin.serviceTest;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.redteamobile.darwin.model.entity.ImsiProfile;
import com.redteamobile.darwin.model.entity.ImsiTransaction;
import com.redteamobile.darwin.model.entity.Merchant;
import com.redteamobile.darwin.service.BundleServiceImpl;
import com.redteamobile.darwin.service.ImsiProfileService;
import com.redteamobile.darwin.service.ImsiTransactionService;
import com.redteamobile.darwin.service.MerchantService;
import com.redteamobile.darwin.service.TransactionService;
import org.h2.mvstore.db.TransactionStore.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTests {
    private final Logger LOG = LoggerFactory.getLogger(ServiceTests.class);

    @Autowired
    private MerchantService merchantService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private ImsiProfileService imsiProfileService;

    @Autowired
    private ImsiTransactionService imsiTransactionService;


    @Test
    public void testTask() throws Exception {
//        String code = "wesim";
//        Merchant merchant = merchantService.getMerchantByCode(code);
//        LOG.info("------" + merchant.getCode());
        String imsi = "234500004200004";
        String transactionCode = "7240";
        ImsiProfile imsiProfile = imsiProfileService.queryImsiProfileByImsi(imsi);
        ImsiTransaction transaction = imsiTransactionService.queryTransactionByCode(transactionCode);
        ObjectNode result = transactionService.getDailyUsage(imsiProfile, transaction);
        LOG.info("result = " + result.toString());

    }
}
