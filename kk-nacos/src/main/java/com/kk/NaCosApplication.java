package com.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.configuration.CompatibilityVerifierAutoConfiguration;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration(exclude = {CompatibilityVerifierAutoConfiguration.class})
public class NaCosApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaCosApplication.class, args);
    }
}
