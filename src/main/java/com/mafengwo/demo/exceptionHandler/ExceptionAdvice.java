package com.mafengwo.demo.exceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenminrui
 * @date 2020-04-27 11:02 上午
 *
 * 全局异常处理，无须再写exceptionmessage
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String getException(Exception e){
        return e.getMessage();
    }
}
