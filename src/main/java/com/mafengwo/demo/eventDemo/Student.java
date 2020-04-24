package com.mafengwo.demo.eventDemo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenminrui
 * @date 2020-04-02 4:19 下午
 */
@Data
@NoArgsConstructor
public class Student {
    private String name;
    private int grade;
    private int fee;
    private int discount=0;

    public Student(String name, int grade, int fee){
        this.name=name;
        this.grade=grade;
        this.fee=fee;
    }
    public int printFee(){
        int newFee = fee - ((fee * discount)/100);
        System.out.println("The fee after discount: " + newFee);
        return newFee;
    }

}
