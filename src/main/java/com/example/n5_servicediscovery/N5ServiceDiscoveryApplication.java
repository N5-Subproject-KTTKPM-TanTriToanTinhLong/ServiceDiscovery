package com.example.n5_servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class N5ServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(N5ServiceDiscoveryApplication.class, args);
    }

}
