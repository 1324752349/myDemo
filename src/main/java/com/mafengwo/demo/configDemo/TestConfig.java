package com.mafengwo.demo.configDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenminrui
 * @date 2020-05-13 10:56 上午
 */
@RestController
public class TestConfig {


    @Autowired
    private Config config;

    @GetMapping("/getconfigPro")
    public String getconfig() {
        System.out.println(config.getFactory());
        System.out.println(config.getEventDemo());
        return "ok";
    }

}
