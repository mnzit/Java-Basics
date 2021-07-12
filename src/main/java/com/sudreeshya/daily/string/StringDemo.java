package com.sudreeshya.daily.string;

public class StringDemo {

    public static void main(String[] args) {
        int i = 1;
        i = 2;
        String x = "Anup" + "s" + "s"; // Immutable -> Cache -> Thread-Safe
        String y = "Anup";
        String z = new String("Anup");
        String a = new String("Anup");

        System.out.println(x == y); // true? X => true -> object compare 1
        System.out.println(z == a); // true? X => false
        System.out.println(x == z); // false? X => false
        System.out.println(x.equals(y)); // true? Value Compare
        System.out.println(z.equals(a)); // true? Value Compare

        // Mutable String Non-Thread Safe
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Anup");
        stringBuilder.append("s");
        stringBuilder.append("s");

        // Mutable String Non-Thread Safe
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Anup");
        stringBuffer.append("s");
        stringBuffer.append("s");

    }
}
