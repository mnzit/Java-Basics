package com.sudreeshya.daily.strategydemo.strategy.v2;

import java.util.Scanner;

public class MathStrategyTester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first operator");
        double x = scanner.nextDouble();
        System.out.println("Enter second operator");
        double y = scanner.nextDouble();

        MathContext mathContext = new MathContext();
        System.out.println("Select your math strategy ?");

        if (scanner.nextLine().equals("sub")) {
            mathContext.setMathStrategy(new SubStrategy());
        } else if (scanner.nextLine().equals("mul")) {
            mathContext.setMathStrategy(new MulStrategy());
        }

        System.out.println("Result : " + mathContext.calculate(x, y));

    }
}
