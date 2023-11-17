package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bank {
    
    @Value("SBI")
    private String bankName; 

    @Value("Ashok Nagar Ranchi")
    private String bankAddress;


    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return this.bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    @Override
    public String toString() {
        return "{" +
            " bankName='" + getBankName() + "'" +
            ", bankAddress='" + getBankAddress() + "'" +
            "}";
    }

}
