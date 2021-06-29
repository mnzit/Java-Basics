package com.sudreeshya.daily.prototype;

public class Square extends Shape{
    public Square() {
        super();
        this.type = "Square";
    }

    @Override void draw() {
        System.out.println("Drawing square");
    }
}
