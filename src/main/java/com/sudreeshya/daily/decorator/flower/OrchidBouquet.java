package com.sudreeshya.daily.decorator.flower;

public class OrchidBouquet extends FlowerBouquet{

    public OrchidBouquet() {
        this.description = "Orchid Bouquet";
    }

    @Override
    public double cost() {
        return 1200.0;
    }
}
