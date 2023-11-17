package com.springcore.stereotype;

import org.springframework.stereotype.Component;

@Component("product")
public class MyComponent {
    private String productName;
    private int productPrice; 


    public MyComponent() {
    }

    public MyComponent(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }


    // public String getProductName() {
    //     return this.productName;
    // }

    // public void setProductName(String productName) {
    //     this.productName = productName;
    // }

    // public int getProductPrice() {
    //     return this.productPrice;
    // }

    // public void setProductPrice(int productPrice) {
    //     this.productPrice = productPrice;
    // }

    @Override
    public String toString() {
        return "{" +
            " productName='" + this.productName + "'" +
            ", productPrice='" + this.productPrice + "'" +
            "}";
    }

}
