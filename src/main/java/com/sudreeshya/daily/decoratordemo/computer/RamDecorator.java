package com.sudreeshya.daily.decoratordemo.computer;

public class RamDecorator extends ComputerDecorator {
    double ramCostPerGB = 1200;
    private Computer computer;

    public RamDecorator(Computer computer, int ram) {
        super.ram = super.ram + ram;
        this.computer = computer;
    }

    @Override
    public double cost() {
        return computer.cost() + (super.ram * ramCostPerGB);
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + String.format("[RAM = %sGB (%s)]", super.ram, (super.ram * ramCostPerGB));
    }
}
