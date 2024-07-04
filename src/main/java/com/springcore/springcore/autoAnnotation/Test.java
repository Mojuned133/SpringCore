package com.springcore.springcore.autoAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[]  args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autoConfigAnnotation.xml");
        Emp emp1=(Emp) context.getBean("emp1");
        System.out.println(emp1);
//        System.out.println(emp1.getAddress().getStreet());
//        System.out.println(emp1.getAddress().getCity());
    }
}
