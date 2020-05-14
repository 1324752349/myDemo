package com.mafengwo.demo.singleton;

/**
 * @author chenminrui
 * @date 2020-04-28 4:49 下午
 */
public enum Enum {

    /*枚举式单例模式*/
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Enum getInstance() {
        return INSTANCE;
    }


}
