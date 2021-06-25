package com.sudreeshya.daily.builder;

public class MainBuilder {

    public static void main(String[] args) {
       Department department = Department
               .builder()
               .id(1L)
               .id(2L)
               .name("Carlos")
               .numberOfMember(200)
               .build();

        System.out.println(department);


        Child child = Child
                .builder()
                .id(1L)
                .fname("Reeamsh")
                .lname("Sanjel")
                .build();


        child.se
        System.out.println(child);
    }
}
