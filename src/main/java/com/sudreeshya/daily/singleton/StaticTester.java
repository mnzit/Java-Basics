package com.sudreeshya.daily.singleton;

import com.sudreeshya.daily.singleton.dto.Student;

public class StaticTester {
    public static void main(String[] args) {
        System.out.println(new Student("Nischal0"));
        System.out.println(new Student("Nischal1"));
        System.out.println(new Student("Nischal2"));
        System.out.println(new Student("Nischal3"));
        System.out.println(new Student("Nischal4"));
    }
}
