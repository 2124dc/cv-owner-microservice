package com.app.cv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoAuditing
public class OwnerMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OwnerMicroserviceApplication.class, args);
        System.out.println("OwnerMicroserviceApplication Successfully started...!!!");
    }

}
