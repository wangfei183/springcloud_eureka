package com.example.springcloud_eurekaclent01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudEurekaclent01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaclent01Application.class, args);
    }

}
