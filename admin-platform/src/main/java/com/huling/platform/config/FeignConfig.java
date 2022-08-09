package com.huling.platform.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * 全局配置：当使用@Configuration 会将配置作用所有的服务
 * 局部配置：如果只想针对某一服务进行配置，就不要加@Configuration
 *
 */
//@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level  feignLoggerLevel(){
        return Logger.Level.FULL;
    }//FULL【比较适用于开发及测试环境定位问题】
}