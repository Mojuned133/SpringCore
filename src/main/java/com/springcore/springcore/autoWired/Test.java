package com.springcore.springcore.autoWired;

import com.springcore.springcore.lifeCycle.Snaks;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[]  args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autoConfig.xml");
        Emp emp1=(Emp) context.getBean("emp1");
        System.out.println(emp1.getAddress().getStreet());
        System.out.println(emp1.getAddress().getCity());
    }
}
