package com.sudreeshya.daily.adapter;

public class MobilePhone {

    public static void main(String[] args) {
        new MobilePhone().chargeMe();
    }

    public void chargeMe() {
        ElectricSocket electricSocket = new ElectricSocket();
        Target target = new MobilePhoneCharger();
        Volt volt = target.getVolt();
        System.out.println("Charging with voltage: " + volt.getVolts());
    }
}
