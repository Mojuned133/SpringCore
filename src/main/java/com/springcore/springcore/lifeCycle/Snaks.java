package com.springcore.springcore.lifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Snaks {
    private String Subject;

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public Snaks(String subject) {
        Subject = subject;
    }

    public Snaks(){

    }

    @PostConstruct
    public void start(){
        System.out.println("starting method");
    }

    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }

    @Override
    public String toString() {
        return "Snaks{" +
                "Subject='" + Subject + '\'' +
                '}';
    }
}
