package com.sudreeshya.daily.prototype;

public class Circle extends Shape {

    private String data;

    public Circle() {
        super();
        this.type = "Circle";
    }

    @Override void draw() {
        System.out.println("Drawing circle");
    }
}
