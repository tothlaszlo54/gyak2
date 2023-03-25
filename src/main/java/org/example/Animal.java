package org.example;

public abstract class Animal {

    private String name;
    private Age age;

    public void setAge(Age age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
