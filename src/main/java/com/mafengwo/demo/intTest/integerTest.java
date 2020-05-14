package com.mafengwo.demo.intTest;

import java.text.SimpleDateFormat;

/**
 * @author chenminrui
 * @date 2020-05-12 4:59 下午
 */
public class integerTest {

    public static void main(String[] args) {
        Integer a= 2;
        Integer b = 3;
        Integer c= null;
        boolean falg = false;
        Object d = a*b;
        System.out.println(d.getClass().getName());
        //会抛出空指针异常，在三元运算符中，要求2，3位的类型相同，而Integer想成的结果是int
//        int  result = falg? a*b:c;
//        System.out.println(result);
//        SimpleDateFormat
    }
}
