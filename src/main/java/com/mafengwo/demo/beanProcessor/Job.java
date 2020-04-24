package com.mafengwo.demo.beanProcessor;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author chenminrui
 * @date 2020-04-07 3:51 下午
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface Job {
    /***
     * 定时任务的name属性
     * @return 表示开启哪一个定时任务
     */
    String name() default "jobname" ;

}

