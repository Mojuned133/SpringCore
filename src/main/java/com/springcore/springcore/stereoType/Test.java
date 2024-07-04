package com.springcore.springcore.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoTypeConfig.xml");
        Student student =(Student) context.getBean("ob");
        System.out.println(student);


    }
}
