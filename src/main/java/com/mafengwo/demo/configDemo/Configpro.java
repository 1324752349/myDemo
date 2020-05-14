package com.mafengwo.demo.configDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenminrui
 * @date 2020-05-13 10:52 上午
 */
@Configuration
public class Configpro {

    @Bean
    @ConfigurationProperties(prefix = "chenminrui.demo")
    public Config getConfigFromPro(){
            return new Config();
    }
}
