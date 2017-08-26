package com.ty;

public class Person {

    private String name;

    private int age;

    private String husband;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getHusband() {
        return husband;
    }

    public Person setHusband(String husband) {
        this.husband = husband;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", husband='" + husband + '\'' + '}';
    }
}
