package com.mafengwo.demo.beanProcessor;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author chenminrui
 * @date 2020-04-07 3:55 下午
 */
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface JobInjected {
    /**
     * injected which interface to implement job service
     */
}
