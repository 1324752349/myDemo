package com.mafengwo.demo.init;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenminrui
 * @date 2020-04-22 9:47 上午
 */
@Component
public class InitDemo implements InitializingBean {

    public static Map<String,String> cityinfo = new ConcurrentHashMap<>();
    static {
        //本地静态代码进行缓存
        cityinfo.put("1","beijing");
        System.out.println("构造函数之前执行");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("容器启动");
    }
}
