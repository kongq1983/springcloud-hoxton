package com.kq.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Profile;

/**
 * ShopApplication
 *
 * @author kq
 * @date 2021/3/13 23:51
 * @since 1.0.0
 */

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
//@Profile("shop")
public class ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

}
