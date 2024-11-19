package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String, Integer> map;
    private Properties prop;

    public Person(){
        super();
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", map=" + map +
                ", prop=" + prop +
                '}';
    }
}
