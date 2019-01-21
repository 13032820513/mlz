package com.mlz.controller.com.mlz.config.web;

import com.ibeetl.starter.BeetlTemplateCustomize;
import org.beetl.core.GroupTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeetlConfig {
    @Bean
    public BeetlTemplateCustomize beetlTemplateCustomize(){
        return new BeetlTemplateCustomize(){
            public void customize(GroupTemplate groupTemplate){

            }
        };
    }
}
