//package com.springcore.springcore.collections;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Test {
//    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/collections/collectionconfig.xml");
//        Emp emp1 = (Emp) context.getBean("Emp1");
//        System.out.println(emp1.getName());
//        System.out.println(emp1.getPhones());
//        System.out.println(emp1.getAddresses());
//        System.out.println(emp1.getCources());
//    }
//
//}

package com.springcore.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp emp1 = (Emp) context.getBean("emp1"); // Corrected bean name to "emp1"
//        Emp emp1 = (Emp) context.getBean("Emp1");

        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses()); // Corrected method name to getCourses()
//        System.out.println(emp1.getCources());
    }
}
