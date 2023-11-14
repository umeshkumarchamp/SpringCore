package com.springcore.constructorinjection;

public class Bank {
    private String bankName; 
    private String branch;
    

    public Bank(String bankName, String branch) {
        this.bankName = bankName;
        this.branch = branch;
    }


    @Override
    public String toString() {
        return "{" +
            " bankName='" + this.bankName + "'" +
            ", branch='" + this.branch + "'" +
            "}";
    }

}
