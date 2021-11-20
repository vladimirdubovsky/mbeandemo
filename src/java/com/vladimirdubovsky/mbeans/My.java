package com.vladimirdubovsky.mbeans;

public class My implements MyMBean {

    private String name;

    @Override
    public void print(String message) {
        System.out.println(message + " " + name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
