package com.springcore.spel;

public class MyBean {
    private String message;
    private int radius; 
    


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

    public double calculateArea(){
        return Math.PI * radius * radius;
        
    }


    @Override
    public String toString() {
        return "{" +
            " message='" + getMessage() + "'" +
            ", radius='" + getRadius() + "'" +
            "}";
    }

}
