package com.nitesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {
    public static void main(String[] args){

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCricketCoach", Coach.class);

        //call method on bean
        System.out.println(theCoach.getWorkout());

        //call method from dependency
        System.out.println(theCoach.getDailyFortune());

        //call method to print literal
        System.out.println(theCoach.getEmailAddress());
        //call method to print literal
        System.out.println(theCoach.getTeam());

        //close the context
        context.close();

    }
}
