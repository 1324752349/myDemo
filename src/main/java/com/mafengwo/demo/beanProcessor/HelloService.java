package com.mafengwo.demo.beanProcessor;

import org.springframework.stereotype.Service;

/**
 * @author chenminrui
 * @date 2020-04-27 1:53 下午
 */
@Service
public class HelloService implements TestInter {

    @Override
    public String sayHello() {
        return  "hello";
    }
}
