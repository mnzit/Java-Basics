package com.sudreeshya.daily.decoratordemo.computer;

public class AIDecorator extends ComputerDecorator {

    double aiCoreCostPerGB = 10000.0;
    private Computer computer;

    public AIDecorator(Computer computer, int aiCore) {
        super.aiCore = super.aiCore + aiCore;
        this.computer = computer;
    }

    @Override
    public double cost() {
        return computer.cost() + (super.aiCore * aiCoreCostPerGB);
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + String.format("[AI-CORE = %s (%s)]", super.aiCore, (super.aiCore * aiCoreCostPerGB));
    }
}
