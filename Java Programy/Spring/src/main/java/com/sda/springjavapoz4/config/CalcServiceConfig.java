package com.sda.springjavapoz4.config;

import com.sda.springjavapoz4.service.CalcService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class CalcServiceConfig {
    @Bean
    @Profile("indyk")
    public CalcService add(){
        return new CalcService("Kotek");
    }
    @Bean
    @Profile("bocian")
    public CalcService multiply(){
        return new CalcService("Piesek");
    }
}
