package com.example.HelloUST;

import org.springframework.stereotype.Component;

@Component
public class Person {
    String name;
    int age;
    Person(){
        System.out.println("Person object created");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    void display(){
        System.out.println("inside display");
    }
}
