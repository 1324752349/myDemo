package com.mafengwo.demo.initializingBean;

import org.springframework.stereotype.Service;

/**
 * @author chenminrui
 * @date 2020-04-29 10:34 上午
 */
@Service
public class WeChatSend implements Send {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public boolean send(String message) {
        return false;
    }
}
