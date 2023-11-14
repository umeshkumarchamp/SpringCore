package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String employeeName; 
    private List<String> phones; 
    private Set<String> addresses;
    private Map<String, String> courses; 
    private Properties props; 

    public Employee() {
    }


    public Employee(String employeeName, List<String> phones, Set<String> addresses, Map<String,String> courses , Properties props) {
        this.employeeName = employeeName;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.props = props;
    }


    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String,String> getCourses() {
        return this.courses;
    }

    public void setCourses(Map<String,String> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return this.props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }


    @Override
    public String toString() {
        return "{" +
            " employeeName='" + getEmployeeName() + "'" +
            ", phones='" + getPhones() + "'" +
            ", addresses='" + getAddresses() + "'" +
            ", courses='" + getCourses() + "'" +
            ", props='" + getProps() + "'" +
            "}";
    }
    

}
