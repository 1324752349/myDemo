package com.mafengwo.demo.optional;

import com.mafengwo.demo.eventDemo.Student;
import org.junit.Test;

import java.util.Optional;

/**
 * @author chenminrui
 * @date 2020-04-07 2:07 下午
 */
public class OptionalDemo {


    public static void optionalTest(){
        /**
         * 无法判断stu是否有值
         * 防止抛出空指针异常
         */
        Student stu = new Student("chenminr",1,100);
        Optional<Student> stu1 = Optional.of(stu);
        System.out.println(stu1.isPresent());

        /**
         * 使用orElse表示进行判断前面的对象是否为空，如果为空，那么使用后面的对象作为默认值
         */
        Student stunull=null;
        Student student = Optional.ofNullable(stunull).orElse(stu);
        System.out.println(student.getName());

    }

    @Test
    public void testOptional(){
        OptionalDemo.optionalTest();
    }

}
