package com.mafengwo.demo.exceptionHandler;

import org.springframework.stereotype.Service;

/**
 * @author chenminrui
 * @date 2020-04-27 11:06 上午
 */
@Service
public class ServiceDemo {

    public String serviceTest() throws  Exception{

        try {
            int x= 2/0;
        }catch ( Exception e ) {
            throw  new Exception("除数不能为0");
        }

        return "";
    }
}
