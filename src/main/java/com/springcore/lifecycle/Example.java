package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject; 

    public Example(){
    }
    public Example(String subject) {
        this.subject = subject;
    }


    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "{" +
            " subject='" + getSubject() + "'" +
            "}";
    }
    
    @PostConstruct
    public void start(){
        System.out.println("Exam Start. ");
    }

    @PreDestroy
    public void end(){
        System.out.println("Exam End.");
    }
}
