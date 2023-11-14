package com.springcore.autowiring;

public class Address {

    private String city; 
    private String state; 

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{" +
            " city='" + getCity() + "'" +
            ", state='" + getState() + "'" +
            "}";
    }

    
}
