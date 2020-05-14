package com.mafengwo.demo.decrition;

/**
 * @author chenminrui
 * @date 2020-05-12 10:59 上午
 */
public class DecooratorB extends  BaseDecorator {

    DecooratorB(IDecorator idecorator) {
        super(idecorator);
    }

    @Override
    public void decorato() {
        //进行自定义的修饰
        System.out.println("Action B");
        super.decorato();//拿到基础Action

    }
}
