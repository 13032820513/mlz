package com.mlz.config;

import com.ibeetl.starter.BeetlTemplateCustomize;
import org.beetl.core.GroupTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Beetl配置
 * @author Zhujun
 *
 */
@Configuration
public class BeetlConf {
    @Bean
    public BeetlTemplateCustomize beetlTemplateCustomize(){
        return new BeetlTemplateCustomize(){
            public void customize(GroupTemplate groupTemplate){

            }
        };
    }

//    @Bean(name = "beetlConfig")
//    public BeetlGroupUtilConfiguration getBeetlGroupUtilConfiguration() {
//        BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
//        ClasspathResourceLoader classpathResourceLoader = new ClasspathResourceLoader();
//        beetlGroupUtilConfiguration.setResourceLoader(classpathResourceLoader);
//        beetlGroupUtilConfiguration.init();
//        return beetlGroupUtilConfiguration;
//    }
//    @Bean(name = "beetlViewResolver")
//    public BeetlSpringViewResolver getBeetlSpringViewResolver(
//            @Qualifier("beetlConfig") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
//        BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
//        beetlSpringViewResolver.setPrefix("/templates/");
//        beetlSpringViewResolver.setSuffix(".html");
//        beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
//        beetlSpringViewResolver.setOrder(0);
//        beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
//        return beetlSpringViewResolver;
//    }

}