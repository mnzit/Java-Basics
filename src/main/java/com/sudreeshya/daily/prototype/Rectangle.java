package com.sudreeshya.daily.prototype;

public class Rectangle extends Shape{
    public Rectangle() {
        super();
        this.type = "Rectangle";
    }

    @Override void draw() {
        System.out.println("Drawing rectangle");
    }
}
