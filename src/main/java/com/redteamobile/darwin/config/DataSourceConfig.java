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
    @Bean(name = "dataSource")
    @Primary
    @Qualifier("dataSource")
    @ConfigurationProperties(prefix = "spring.database")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcTemplate")
    @Primary
    public JdbcTemplate jdbcTemplate(
            @Qualifier("dataSource") DataSource dataSource
    ) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "darwinDataSource")
    @Qualifier("darwinDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.darwin")
    public DataSource darwinDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "darwinJdbcTemplate")
    public JdbcTemplate darwinJdbcTemplate(
            @Qualifier("darwinDataSource") DataSource dataSource
    ) {
        return new JdbcTemplate(dataSource);
    }
}
