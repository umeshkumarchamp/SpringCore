package com.springcore.stereotype;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    @Value("1")
    private int id;

    @Value("Anil Kapoor")
    private String name;

    @Value("anil@gmail.com")
    private String email;

    @Value("#{11+22}")
    private int age; 

    @Value("6201033951")
    private Long phone;
    
    @Value("Ranchi Jharkhand")
    private String address; 
    
    @Value("#{courses}")
    private Set<String> courses; 


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public Set<String> getCourses() {
        return this.courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public Long getPhone() {
        return this.phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", age='" + getAge() + "'" +
            ", phone='" + getPhone() + "'" +
            ", address='" + getAddress() + "'" +
            ", courses='" + getCourses() + "'" +
            "}";
    }


}
