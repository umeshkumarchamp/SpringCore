package com.springcore.setterinjection.beans;

public class Course {
    private int courseId; 
    private String name;
    private String duration; 
    private int fee; 


    public Course() {
    }

    public Course(int courseId, String name, String duration, int fee) {
        this.courseId = courseId;
        this.name = name;
        this.duration = duration;
        this.fee = fee;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getFee() {
        return this.fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "{" +
            " courseId='" + getCourseId() + "'" +
            ", name='" + getName() + "'" +
            ", duration='" + getDuration() + "'" +
            ", fee='" + getFee() + "'" +
            "}";
    }

}
