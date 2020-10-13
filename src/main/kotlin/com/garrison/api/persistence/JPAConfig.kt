package com.garrison.api.persistence

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment

import javax.sql.DataSource


@Configuration
class DataSourceConfig {
    var LOGGER: Logger = LoggerFactory.getLogger(this.javaClass)

    @Autowired
    private val env: Environment? = null

    @Bean
    fun getDataSource(): DataSource {
//        LOGGER?.info("foo: getDataSource")
//        var host = env?.getProperty("PG_HOST");
//        var port = env?.getProperty("PG_PORT");
//        var name = env?.getProperty("PG_DBNAME");
//        var username = env?.getProperty("PG_USERNAME");
//        var password = env?.getProperty("PG_PASSWORD");
//
//        LOGGER?.info("host: $host")
//        LOGGER?.info("port: $port")
//        LOGGER?.info("username: $username")
//        LOGGER?.info("password: $password")

        val dataSourceBuilder = DataSourceBuilder.create()
        dataSourceBuilder.driverClassName("org.postgresql.Driver")
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/postgres")
        dataSourceBuilder.username("postgres")
//        dataSourceBuilder.password("$password")
        return dataSourceBuilder.build()
    }
}