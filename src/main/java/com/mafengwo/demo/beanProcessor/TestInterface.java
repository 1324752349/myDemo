package com.mafengwo.demo.beanProcessor;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;

/**
 * @author chenminrui
 * @date 2020-04-27 1:51 下午
 */
public class TestInterface implements BeanPostProcessor {

    /**
     * 这里的 bean表示spring容器中所有初始化的bean
     * 调用bean初始化后的后置方法进行一定的操作
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @SneakyThrows
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof  TestInter){
            TestInter testInter=(TestInter) bean;
            String s = testInter.sayHello();
            System.out.println(s);
        }
        return null;
    }
}
