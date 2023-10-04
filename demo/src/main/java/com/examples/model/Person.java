package com.examples.model;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }    
}