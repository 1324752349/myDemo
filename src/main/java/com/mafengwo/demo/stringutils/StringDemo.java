package com.mafengwo.demo.stringutils;


import org.apache.commons.lang3.StringUtils;

import javax.annotation.PostConstruct;

/**
 * @author chenminrui
 * @date 2020-05-13 11:46 上午
 */
public class StringDemo {
    public static void main(String[] args) {
        /**
         * 推荐使用isBlank 进行判空处理
         */
        StringUtils.isEmpty("hh");
        StringUtils.isBlank("  ");
//        StringBuilder
    }
}
