package com.sudreeshya.day5.depedencyinversion;

public class DITester {
    public static void main(String[] args) {
        test(new SubV2());
    }

    public static void test(Calculation calculation){
        System.out.println(calculation.calculate(1.1,2.1));
    }
}
