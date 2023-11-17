package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{8+3}")
    private int x; 

    @Value("#{8+9}")
    private int y;
    
    @Value("#{T(java.lang.Math).sqrt(225)}")
    private double z; 

    @Value("#{T(java.lang.Math).PI}")
    private double pi; 

    @Value("#{ new java.lang.String('Umesh Kumar')}")
    private String name; 

    @Value("#{8-5>3}")
    private boolean isActive; 

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    

    public double getPi() {
        return this.pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    


    public boolean isIsActive() {
        return this.isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            ", z='" + getZ() + "'" +
            ", pi='" + getPi() + "'" +
            ", name='" + getName() + "'" +
            ", isActive='" + isIsActive() + "'" +
            "}";
    }


    
    

}
