package com.mytests.thymeleaf.thymeleafvars;

/**
 * *
 * <p>Created by irina on 11/2/2022.</p>
 * <p>Project: thymeleaf-vars</p>
 * *
 */
public class Message {
    String greeting;

    public Message(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
