package com.sudreeshya.daily.singleton.dto;

public class Student {
    private static int id; // class variable
    private String name; // instance variable

    public Student(String name) {
        id++;
        this.name = name;
    }

    @Override public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
