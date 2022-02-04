package com.nitesh.springdemo;

public class BaseballCoach implements Coach {

    //define a private field for dependency(helper)
    private FortuneService fortuneService;

    //define a constructor for dependency injection, basically to accept the dependency
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getWorkout() {
        return "Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use fortune service to get a fortune
        return fortuneService.getFortune();
    }

    @Override
    public String getEmailAddress() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }

    //creating a init method
    public void doMyStartupStuff() {
        System.out.println("we're inside the custom init method");
    }

    //creating a destroy method
    public void doMyCleanupStuff() {
        System.out.println("We're inside custom destroy method");
    }
}
