package com.sudreeshya.daily.decoratordemo.computer;
// Wrong way
public class ComputerCreator {

    private final double ramCostPerGB = 1200;
    private final double hddCostPerGB = 7;

    public String build(String description, int ram, int hdd){
        return description + (String.format("[RAM = %sGB (%s)]", ram, (ram * ramCostPerGB)))+ (String.format("[HDD = %sGB (%s)]", hdd, (hdd * hddCostPerGB)));
    }
}
