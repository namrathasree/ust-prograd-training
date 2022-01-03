package com.example.HelloUST;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    String model;
    String color;
//    Phone()
//    {
//        System.out.println("Phone Object Created");
//    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void show(){
        System.out.println("inside show");
    }
}
