package com.mafengwo.demo.configDemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author chenminrui
 * @date 2020-05-13 10:53 上午
 */
@Data
public class Config {

    public String factory ;
    public String eventDemo;
}
