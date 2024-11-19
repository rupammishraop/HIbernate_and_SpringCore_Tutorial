package org.example;

import java.util.*;

public class MapBean {

    private  Map<String, Integer> map = new HashMap<>();

    public MapBean(Map<String, Integer> map) {
        this.map = map;
    }

    public MapBean() {
        super();
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "MapBean{" +
                "map=" + map +
                '}';
    }
}
