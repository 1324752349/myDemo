package com.mafengwo.demo.eventDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenminrui
 * @date 2020-04-07 11:31 上午
 */
@RestController
public class TestEventDemo {

    @Autowired
    ApplicaitonEventAware applicaitonEventAware;

    @GetMapping("/eventDemo")
    public String getStudentEvent(){
        /**
         * 这里进行初始化整个spring容器
         */
        applicaitonEventAware.init();
        return "ok";
    }

    @GetMapping("/")
    public String testOk(){
        return "ok";
    }
}
