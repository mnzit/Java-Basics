package com.sudreeshya.daily.decoratordemo.flower;

import lombok.Getter;

@Getter
public abstract class FlowerBouquet {

   protected String description;

   public abstract double cost();
}
