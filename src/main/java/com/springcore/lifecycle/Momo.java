package com.springcore.lifecycle;

public class Momo {
    private double price; 


    public Momo() {
    }

    public Momo(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        System.out.println("Setting Momo price : " + price);
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
            " price='" + getPrice() + "'" +
            "}";
    }

    public void init(){
        System.out.println("Inside init() method : momo");
    }

    public void destroy(){
        System.out.println("Inside destroy() method : momo");
    }

}
