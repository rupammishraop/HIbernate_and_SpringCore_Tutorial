package org.example;

import java.util.*;

public class SetBean {
    private Set<Integer> set = new HashSet<>();

    public SetBean(Set<Integer> set) {
        this.set = set;
    }

    public SetBean() {
        super();
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "SetBean{" +
                "set=" + set +
                '}';
    }
}
