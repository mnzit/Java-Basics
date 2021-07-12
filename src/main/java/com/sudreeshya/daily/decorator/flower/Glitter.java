package com.sudreeshya.daily.decorator.flower;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Glitter extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;
    @Override
    public double cost() {
        return flowerBouquet.cost() + 50.0;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", Glitter";
    }
}
