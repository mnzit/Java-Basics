package com.sudreeshya.daily.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        System.out.println(circle);
        circle.setSize(112);
        circle.draw();
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        System.out.println(rectangle);
        rectangle.setSize(112);
        rectangle.draw();
    }
}
