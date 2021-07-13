package com.sudreeshya.daily.decoratordemo;

import com.sudreeshya.daily.decoratordemo.computer.*;

public class DecoratorTester {

    public static void main(String[] args) {
//        FlowerBouquet bouquet1 = new OrchidBouquet();
//        bouquet1 = new PaperWrapper(bouquet1);
//        bouquet1 = new Glitter(bouquet1);
//        System.out.println(bouquet1.getDescription());
//        System.out.println(bouquet1.cost());

        // Void's Closed for modification/ Open for extension principle as well as SRP
        System.out.println(new ComputerCreator().build("DELL-PC", 2, 120));

        Computer computer = new DellLaptop();
        computer = new RamDecorator(computer, 16);
        computer = new HddDecorator(computer, 500);
        computer = new AIDecorator(computer, 4);

        System.out.println(computer.getDescription());
        System.out.println("Price: " + computer.cost());
    }
}
