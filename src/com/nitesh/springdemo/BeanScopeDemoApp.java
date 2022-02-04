package com.nitesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("\nBoth objects point to same address: " + result);

        System.out.println("\nMemory address of object theCoach : " + theCoach);

        System.out.println("\nMemory address of object alphaCoach : " + alphaCoach);

        //close the context
        context.close();
    }
}
