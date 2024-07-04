package com.springcore.springcore.standalon.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonCollectionsConfig.xml");
        Person p1=(Person) context.getBean("person1");
        Person p2=(Person) context.getBean("person2");
        Person p3=(Person) context.getBean("person3");
        System.out.println(p1);
        System.out.println(p2.getFriends().getClass());
        System.out.println(p3.getFeestructure());
    }
}
