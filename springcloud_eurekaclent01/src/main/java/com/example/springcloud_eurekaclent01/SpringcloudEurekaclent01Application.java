package com.example.springcloud_eurekaclent01;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableDistributedTransaction
@EnableTransactionManagement
@EnableDiscoveryClient

public class SpringcloudEurekaclent01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaclent01Application.class, args);
    }

}
