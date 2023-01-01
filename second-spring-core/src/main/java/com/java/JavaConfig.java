package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import java.util.Date;

@Configuration
public class JavaConfig {

    @Bean
    @Description("java based config example")
    public Date getDate(){
        Date date = new Date();
        return date;
    }
}
