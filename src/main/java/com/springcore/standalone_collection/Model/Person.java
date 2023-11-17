package com.springcore.standalone_collection.Model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    private List<String> friends; 
    private Map<String, Integer> courses; 
    private Properties props; 
    private Set<String> phone; 

    public List<String> getFriends() {
        return this.friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String,Integer> getCourses() {
        return this.courses;
    }

    public void setCourses(Map<String,Integer> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return this.props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }


    public Set<String> getPhone() {
        return this.phone;
    }

    public void setPhone(Set<String> phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "{" +
            " friends='" + getFriends() + "'" +
            ", courses='" + getCourses() + "'" +
            ", props='" + getProps() + "'" +
            ", phone='" + getPhone() + "'" +
            "}";
    }

    


}
