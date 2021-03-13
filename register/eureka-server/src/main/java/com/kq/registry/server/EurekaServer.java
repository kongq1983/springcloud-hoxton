package com.kq.registry.server;

/**
 * EurekaServer
 *
 * @author kq
 * @date 2021/3/13 23:24
 * @since 1.0.0
 */
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer.class).web(WebApplicationType.SERVLET).run(args);
    }
}
