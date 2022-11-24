package com.example.myoceanproject.config;

import com.p6spy.engine.spy.P6SpyOptions;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class P6spySqlFormatConfiguration {
    @PostConstruct
    public void setLogMessageFormat() {
        P6SpyOptions.getActiveInstance().setLogMessageFormat(CustomP6spySqlFormat.class.getName());
    }
}