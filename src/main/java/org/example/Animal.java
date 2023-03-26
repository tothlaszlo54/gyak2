package org.example;

public class Animal {

    private String name;
    private Age age;

    public Animal(){
    }
    public Animal(String name, Age age) {
        this.name = name;
        this.age = age;
    }


    public Animal(String name, int year, int month, int day) {
        this.name = name;
        this.age.setMonth(month);
        this.age.setDay(day);
        this.age.setYear(year);
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setAge(int year, int month, int day) {
        this.age.setYear(year);
        this.age.setMonth(month);
        this.age.setDay(day);
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

    @Override
    public String toString() {
        return "A neve: " + name + " A kora: " + age + " ";
    }
}
