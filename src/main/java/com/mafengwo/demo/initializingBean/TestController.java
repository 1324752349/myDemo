package com.mafengwo.demo.initializingBean;

import org.codehaus.plexus.personality.plexus.lifecycle.phase.InitializationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author chenminrui
 * @date 2020-04-29 10:34 上午
 */
@RestController
public class TestController {

    @GetMapping("/getSender")
    public String getSender() throws InitializationException {
        InitalizDemo i = new InitalizDemo();
        Map<String, Send> senders = i.getSenders();
        System.out.println(senders.toString());

        return  "ok";
    }

}
