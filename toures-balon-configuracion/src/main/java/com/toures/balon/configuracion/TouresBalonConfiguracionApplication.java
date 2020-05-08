package com.toures.balon.configuracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TouresBalonConfiguracionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TouresBalonConfiguracionApplication.class, args);
    }

}
