package com.mafengwo.demo.beanProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenminrui
 * @date 2020-04-27 1:58 下午
 */
@Configuration
public class Configuartion {

    @Bean
    public TestInterface testInterface (){
        return  new TestInterface();
    }
}
