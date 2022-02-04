package com.nitesh.springdemo;

public class CricketCoach implements Coach {

    //define private fields for accepting literals
    private String emailAddress;
    private String team;

    //define a private field for dependency(helper)
    private FortuneService fortuneService;

    //define a setter for dependency injection, basically to accept the dependency
    public void setFortuneService (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //define a setter for literal injection
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    //define a setter for literal injection
    public void setTeam(String team) {
        this.team = team;
    }
    //define a getter to return literal value
    @Override
    public String getEmailAddress () {
        return emailAddress;
    }
    //define a getter to return literal value
    @Override
    public String getTeam () {
        return team;
    }

    @Override
    public String getWorkout () {
        return "Spend 30 min on stumping practice";
    }

    @Override
    public String getDailyFortune () {
        return fortuneService.getFortune();
    }
}
