package com.sudreeshya.daily.prototype;

public class ShapeFactory {

    // prototypes
    private static Shape[] shapes = new Shape[]
            {
                    new Circle(),
                    new Rectangle(),
                    new Square()
            };

    // you can use Map data structure too
    public static Shape getShape(String type) {
        for (int i = 0; i <= shapes.length; i++) {
            if (shapes[i].getType().equals(type)) {
                return (Shape) shapes[i].clone();
            }
        }
        return null;
    }
}
