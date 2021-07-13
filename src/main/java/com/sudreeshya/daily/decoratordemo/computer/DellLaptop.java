package com.sudreeshya.daily.decoratordemo.computer;

public class DellLaptop extends Laptop {

    public DellLaptop() {
        this.description = "DELL-LT";
    }

    @Override
    public double cost() {
        return 0.0;
    }
}
