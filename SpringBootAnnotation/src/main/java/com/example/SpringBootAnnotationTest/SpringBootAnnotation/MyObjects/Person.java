package com.example.SpringBootAnnotationTest.SpringBootAnnotation.MyObjects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Inside "+ this.name + " Person Constructor...object must have been created!!!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
