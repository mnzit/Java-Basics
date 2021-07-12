package com.sudreeshya.daily.decorator.computer;

public class HddDecorator extends ComputerDecorator {
    double hddCostPerGB = 7.0;
    private Computer computer;

    public HddDecorator(Computer computer, int hdd) {
        super.hdd = super.hdd + hdd;
        this.computer = computer;
    }

    @Override
    public double cost() {
        return computer.cost() + (super.hdd * hddCostPerGB);
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + String.format("[HDD = %sGB (%s)]", super.hdd, (super.hdd * hddCostPerGB));
    }
}
