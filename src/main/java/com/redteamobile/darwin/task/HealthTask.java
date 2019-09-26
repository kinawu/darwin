package com.redteamobile.darwin.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HealthTask {
    private final Logger LOG = LoggerFactory.getLogger(HealthTask.class);

    @Scheduled(cron = "*/2 * * * * *")
    public void reportHealthTask() {
            LOG.info("darwin service running.");
    }
}
