package com.collections.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;
    private List<Long> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties prop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getPhones() {
        return phones;
    }

    public void setPhones(List<Long> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public Emp(String name, List<Long> phones, Set<String> addresses, Map<String, String> courses, Properties prop) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.prop = prop;
    }
    public Emp() {
        super();
    }
}
