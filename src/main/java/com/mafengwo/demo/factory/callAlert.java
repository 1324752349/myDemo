package com.mafengwo.demo.factory;

import java.io.Serializable;

/**
 * @author chenminrui
 * @date 2020-04-23 2:25 下午
 */
public interface callAlert extends Serializable {

    void call(String recevier, String title);
}
