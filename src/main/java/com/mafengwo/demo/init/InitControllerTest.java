package com.mafengwo.demo.init;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenminrui
 * @date 2020-04-22 11:30 上午
 */
@RestController
public class InitControllerTest {

    @GetMapping("/city")
    public String getCityInfo(){
      return   InitDemo.cityinfo.get("1");
    }
}
