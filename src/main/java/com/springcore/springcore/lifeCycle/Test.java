package com.springcore.springcore.lifeCycle;

import com.springcore.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.Subject;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("samosaConfig.xml");
//        Samosa s1 = (Samosa) context.getBean("s1");
//
//        System.out.println(s1);
////        registring shutdown hook
        context.registerShutdownHook();
//
//        Pepsi p1 = (Pepsi) context.getBean( "p1");
//        System.out.println(p1);
//        context.registerShutdownHook();

        Snaks S1= (Snaks) context.getBean("S1");
        System.out.println(S1);

    }
}
