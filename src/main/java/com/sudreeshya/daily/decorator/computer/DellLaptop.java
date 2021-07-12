package com.sudreeshya.daily.decorator.computer;

public class DellLaptop extends Laptop {

    public DellLaptop() {
        this.description = "DELL-LT";
    }

    @Override
    public double cost() {
        return 0.0;
    }
}
