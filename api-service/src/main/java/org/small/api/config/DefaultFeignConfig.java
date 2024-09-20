package org.small.api.config;

import feign.Logger;
import feign.RequestInterceptor;
import org.small.api.Interceptor.UserInfoInterceptor;
import org.small.api.client.fallback.ItemClientFallbackFactory;
import org.springframework.context.annotation.Bean;

public class DefaultFeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

    @Bean
    public RequestInterceptor requestInterceptor(){
        return new UserInfoInterceptor();
    }

    @Bean
    public ItemClientFallbackFactory fallbackFactory(){
        return new ItemClientFallbackFactory();
    }

}
