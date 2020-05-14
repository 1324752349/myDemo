package com.mafengwo.demo.exceptionHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenminrui
 * @date 2020-04-27 11:05 上午
 */
@RestController
public class controllerDemo  {


    @Autowired
    private ServiceDemo serviceDemo;

    @GetMapping("/ExceptionDemo")
    @ResponseBody
    public String testExceptionAadvice() throws Exception {
        return serviceDemo.serviceTest();
    }
}
