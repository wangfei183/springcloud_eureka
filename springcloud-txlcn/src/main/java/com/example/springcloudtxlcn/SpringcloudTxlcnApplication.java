package com.example.springcloudtxlcn;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableTransactionManagerServer
@SpringBootApplication

public class SpringcloudTxlcnApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringcloudTxlcnApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTxlcnApplication.class, args);
        logger.info("tx-lcn项目tm事务协调者启动--------------------------");

    }

}
