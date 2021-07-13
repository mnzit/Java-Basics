package com.sudreeshya.daily.decoratordemo.flower;

public class RoseBouquet extends FlowerBouquet{

    public RoseBouquet() {
        this.description = "Rose Bouquet";
    }

    @Override
    public double cost() {
        return 1000.0;
    }
}
