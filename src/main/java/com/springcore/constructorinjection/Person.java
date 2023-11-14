package com.springcore.constructorinjection;

import java.util.Set;

public class Person {
    private int id;
    private String name;
    private Bank bank;
    private Set<String> qualifications; 

    public Person(int id, String name, Bank bank, Set<String> qualifications) {
        this.id = id;
        this.name = name;
        this.bank = bank;
        this.qualifications = qualifications;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + this.id + "'" +
            ", name='" + this.name + "'" +
            ", bank='" + this.bank + "'" +
            ", qualifications='" + this.qualifications +
            "}";
    }


}
