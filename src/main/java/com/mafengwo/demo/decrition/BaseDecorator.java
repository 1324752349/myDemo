package com.mafengwo.demo.decrition;

/**
 * @author chenminrui
 * @date 2020-05-12 10:55 上午
 */
public abstract class BaseDecorator  implements  IDecorator{
    private IDecorator idecorator;

    BaseDecorator(IDecorator idecorator){
        this.idecorator = idecorator;

    }

    @Override
    public void decorato() {
        if(idecorator != null) {
            //通过基础构造器，创建一个基础action的类型
            idecorator.decorato();
        }
    }
}
