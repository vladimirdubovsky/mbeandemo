package com.vladimirdubovsky.mbeans;

public interface MyMBean {
    void print(String message);

    void setName(String name);

    String getName();
}
