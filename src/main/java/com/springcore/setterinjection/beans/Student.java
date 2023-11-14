package com.springcore.setterinjection.beans;

import java.util.Date;

public class Student {
    private String studentId; 
    private String name; 
    private String email;
    private Long phone; 
    private Date dob; 
    private Course course; 

    public Student() {
    }

    public Student(String studentId, String name, String email, Long phone, Date dob, Course course) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.course = course;
    }   


    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public Long getPhone() {
        return this.phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getDob() {
        return this.dob.toLocaleString();
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "{" +
            " studentId='" + getStudentId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            ", dob='" + getDob() + "'" +
            ", course='" + getCourse() + "'" +
            "}";
    }


}
