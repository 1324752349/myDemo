package com.mafengwo.demo.eventDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

/**
 * @author chenminrui
 * @date 2020-04-07 11:15 上午
 */
@Order
@Component
public class ApplicaitonEventAware implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void init() {
        /**
         * 发布事件的两种方式
         */
        assertContextInjected();
        applicationContext.publishEvent(new springbootEventDemo<Student>(new Student("姜依", 1, 100)));
        applicationEventPublisher.publishEvent(new springbootEventDemo<Student>(new Student("jiangyi", 1, 100)));
    }

    @EventListener
    public void studentListener(springbootEventDemo<Student> demo) {
        System.out.println(demo.getStu().getName());
    }

    /**
     * 检查applicaitonContext上下文对象
     */
    private void assertContextInjected() {
        Assert.isTrue(applicationContext != null, "applicaitonContext属性未注入, 请在applicationContext.xml中定义SpringContextHolder.");
    }

}
