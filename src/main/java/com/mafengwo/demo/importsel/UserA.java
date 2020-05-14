package com.mafengwo.demo.importsel;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chenminrui
 * @date 2020-05-12 3:27 下午
 */
@Data
@AllArgsConstructor
public class UserA {
    private String name;
    private int age;

    public UserA(){
        this.name="chen minr ";
        this.age = 22;
    }
}
