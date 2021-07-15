package com.sudreeshya.daily.generic;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Product<NormalMember> softDoll = new Product<>();

        softDoll.setName("Pooh Bear");
        softDoll.setCreatedBy(new NormalMember(1L));
        softDoll.setDescription("        softDoll.setDescription(\"\");\n");
        softDoll.setCreatedDate(new Date());



        MathCommand<Integer, Integer> addInteger = (x, y) -> x + y;

        System.out.println(MathCommandStore.subDoubleCommand.calculate(3.0, 2.0));
        System.out.println(MathCommandStore.addDoubleCommand.calculate(3.0, 2.0));
    }
}
