package com.mafengwo.demo.decrition;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author chenminrui
 * @date 2020-05-12 11:01 上午
 */
public class Test {

    public static void main(String[] args) {
        IDecorator decorator = new Decorator();
        IDecorator decoratorA = new DecooratorA(decorator);
        IDecorator decoratorB = new DecooratorB(decoratorA);
        decoratorB.decorato();

    }
}
