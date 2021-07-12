package com.sudreeshya.daily.decorator.flower;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaperWrapper extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    @Override
    public double cost() {
        return flowerBouquet.cost() + 150.0;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", Paper Wrapper";
    }
}
