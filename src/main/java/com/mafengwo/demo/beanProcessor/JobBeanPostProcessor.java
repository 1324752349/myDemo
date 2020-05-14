package com.mafengwo.demo.beanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Map;

import static java.lang.reflect.Modifier.*;
import static java.lang.reflect.Modifier.isAbstract;

/**
 * @author chenminrui
 * @date 2020-04-07 4:03 下午
 */
@Component
public class JobBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private ApplicationContext applicationContext;


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean.getClass().isAnnotationPresent(JobInjected.class)){
            handleObject(bean);
        }
        return bean;
    }

    private void handleObject(Object object) {
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getMethods();
        for(Method method:methods){
            if (check(method)){
                Job job = method.getAnnotation(Job.class);
                String name = job.name();
                if(JobProxy.hasjobname(name)){
                    throw  new RuntimeException("jobname chongfu");
                }
                JobProxy.put(name);
            }
        }
    }
    private boolean check(Method method){
        int modifiers = method.getModifiers();
        return isPublic(modifiers)
                && method.isAnnotationPresent(Job.class)
                && !isStatic(modifiers)
                && !isNative(modifiers)
                && !isAbstract(modifiers);
    }

}
