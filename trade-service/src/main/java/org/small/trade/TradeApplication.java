package org.small.trade;

import org.mybatis.spring.annotation.MapperScan;
import org.small.api.config.DefaultFeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "org.small.api.client", defaultConfiguration = DefaultFeignConfig.class)
@MapperScan("org.small.trade.mapper")
@SpringBootApplication
public class TradeApplication {
    public static void main(String[] args) {
        SpringApplication.run(TradeApplication.class, args);
    }
}