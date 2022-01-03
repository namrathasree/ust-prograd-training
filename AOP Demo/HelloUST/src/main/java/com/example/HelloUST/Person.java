package com.example.HelloUST;

import org.springframework.stereotype.Component;

@Component
public class Person {
    String name;
    int age;
//    Person(){
//        System.out.println("Person object created");
//    }
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
    public void show(){
        System.out.println("inside show");
    }
    public void shown(int ID){
        System.out.println("inside shown");
        throw new IllegalArgumentException("ID not found");
    }
    public void notshow(){
        System.out.println("inside notshow");
    }
}
