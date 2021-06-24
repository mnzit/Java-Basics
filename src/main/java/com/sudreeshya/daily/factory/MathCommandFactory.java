package com.sudreeshya.daily.factory;

public class MathCommandFactory {

    public static MathCommand get(String operator) {
        MathCommand mathCommand = null;

        switch (operator) {
            case "add":
                mathCommand = new AddCommand();
                break;
            case "sub":
                mathCommand = new SubCommand();
                break;
            default:
                mathCommand = new NullCommand();
        }

        return mathCommand;
    }
}
