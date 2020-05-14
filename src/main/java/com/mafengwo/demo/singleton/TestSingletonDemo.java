package com.mafengwo.demo.singleton;

/**
 * @author chenminrui
 * @date 2020-04-28 4:50 下午
 */
public class TestSingletonDemo {

    public static void main(String[] args) {
        Enum instance = Enum.getInstance();
        instance.setData("hhhh");
        System.out.println(instance.getData());

    }
}
