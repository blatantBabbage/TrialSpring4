package com.nitesh.springdemo;

public class TrackCoach implements Coach {

    @Override
    public String getWorkout () {
        return "Run a dog 8k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getEmailAddress() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }
}
