package com.mafengwo.demo.factory;

import java.util.Map;

/**
 * @author chenminrui
 * @date 2020-04-23 1:44 下午
 */
public class StrategyFactory {

    public static void main(String[] args) {
        String alertWay = null;
        if("weChat".equals(alertWay)){
            //调用微信接口实现类发送微信
        }else if ("sms".equals(alertWay)){
            //短信
        }else if("email".equals(alertWay)){
            //邮箱
        }else if("voice".equals(alertWay)){
            //语音
        }
    }
}
