package org.small.user;


import org.mybatis.spring.annotation.MapperScan;
import org.small.api.config.DefaultFeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "org.small.api.client", defaultConfiguration = DefaultFeignConfig.class)
@MapperScan("org.small.user.mapper")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}