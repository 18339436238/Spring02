package com.fxh.annonation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.fxh.annonation")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {

   @Bean
    public Boy getBoy(){
        return new Boy();
    }

}
