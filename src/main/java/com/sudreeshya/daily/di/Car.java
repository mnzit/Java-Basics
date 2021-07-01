package com.sudreeshya.daily.di;


public class Car {
    private String vrn;
    private String model;
    private String type;

    @Autowired
    private Engine engine;

    public Car (){
        engine.start();
    }
}
