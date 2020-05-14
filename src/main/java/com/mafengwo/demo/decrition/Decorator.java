package com.mafengwo.demo.decrition;

/**
 * @author chenminrui
 * @date 2020-05-12 10:54 上午
 */
public class Decorator implements  IDecorator{

    @Override
    public void decorato() {
        System.out.println("base action");
    }
}
