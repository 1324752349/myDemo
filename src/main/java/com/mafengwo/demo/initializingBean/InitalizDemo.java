package com.mafengwo.demo.initializingBean;


import lombok.Data;
import org.codehaus.plexus.personality.plexus.lifecycle.phase.Initializable;
import org.codehaus.plexus.personality.plexus.lifecycle.phase.InitializationException;
import org.springframework.stereotype.Component;
import org.unidal.lookup.ContainerHolder;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * @author chenminrui
 * @date 2020-04-23 1:43 下午
 */
@Component
@Data
public class InitalizDemo extends ContainerHolder implements Initializable {


    Map<String,Send> senders = new HashMap<String,Send>();

    @Override
    public void initialize() throws InitializationException {
        System.out.println("chushihua locaton");
        senders = lookupMap(Send.class);
    }
}
