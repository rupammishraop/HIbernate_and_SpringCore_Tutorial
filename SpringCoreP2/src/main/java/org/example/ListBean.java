package org.example;

import java.util.ArrayList;

public class ListBean {
    private ArrayList<Integer> list = new ArrayList<>();

    public ListBean(ArrayList<Integer> list) {
        this.list = list;
    }

    public ListBean() {
        super();
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListBean{" +
                "list=" + list +
                '}';
    }
}
