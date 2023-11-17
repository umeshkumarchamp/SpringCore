package com.springcore.javaconfig.model;


public class MyBean {
    
    private String message;
    private int radius;

    private Samosa samosa; 


    public MyBean(Samosa samosa) {
        this.samosa = samosa;
    }


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public Samosa getSamosa() {
        return this.samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }


    @Override
    public String toString() {
        return "{" +
            " message='" + getMessage() + "'" +
            ", radius='" + getRadius() + "'" +
            "}";
    }

}
