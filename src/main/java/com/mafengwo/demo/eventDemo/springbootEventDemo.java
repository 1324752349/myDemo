package com.mafengwo.demo.eventDemo;

import org.springframework.context.ApplicationEvent;

/**
 * @author chenminrui
 * @date 2020-04-07 11:13 上午
 */
public class springbootEventDemo<Student> extends ApplicationEvent {


    public springbootEventDemo(Student source) {
        super(source);
        this.stu= source;
    }

    private Student stu;

    public Student getStu(){
        return  stu;
    }

}

