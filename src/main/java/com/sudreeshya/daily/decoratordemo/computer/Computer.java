package com.sudreeshya.daily.decoratordemo.computer;

import lombok.ToString;

@ToString
public abstract class Computer {

    protected int ram;
    protected int ssd;
    protected int hdd;
    protected double clockSpeed;
    protected double core;
    protected double aiCore;

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
