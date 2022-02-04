package com.nitesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] arg) {

        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //get the bean
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on bean
        System.out.println(theCoach.getWorkout());

        //close the context
        context.close();
    }
}
