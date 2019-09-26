package com.redteamobile.darwin.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Primary
    @Bean(name = "newtonDataSource")
    @Qualifier("newtonDataSource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource newtonDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "newtonJdbcTemplate")
    public JdbcTemplate newtonJdbcTemplate(
            @Qualifier("newtonDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }


    @Bean(name = "darwinDataSource")
    @Qualifier("darwinDataSource")
    @ConfigurationProperties(prefix="spring.datasource.darwin")
    public DataSource darwinDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "darwinJdbcTemplate")
    public JdbcTemplate darwinJdbcTemplate(
            @Qualifier("darwinDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
