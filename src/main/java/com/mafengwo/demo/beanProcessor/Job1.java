package com.mafengwo.demo.beanProcessor;

import org.springframework.stereotype.Service;

/**
 * @author chenminrui
 * @date 2020-04-07 3:57 下午
 */

public class Job1  {

    @Job(name ="A")
    public void excuterJob() {
        System.out.println("scheduler is running");
        System.out.println("implement job1");
    }
}
