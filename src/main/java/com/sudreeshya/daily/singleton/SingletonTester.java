package com.sudreeshya.daily.singleton;

import com.sudreeshya.daily.singleton.dto.Person;

public class SingletonTester {
    public static void main(String[] args) {
        Person person1 = Person.getInstance();

        System.out.println(person1);
        Person person2 = Person.getInstance();



        System.out.println(person2);
    }
}
