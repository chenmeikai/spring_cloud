package com.kenhome;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: cmk
 * @Description:
 * @Date: Created in 16:41 2018/10/17 0017
 * @Modified By:
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLogLevel() {
        return Logger.Level.FULL;
    }
}
