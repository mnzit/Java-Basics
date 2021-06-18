package com.sudreeshya.day5;

// concrete - complete
public class BasketballV2 extends Basketball {

    @Override public void play() {
        super.play();
        System.out.println("Adding new features in V2");
    }

    public void flysBack(){
        System.out.println("Adding new features of flying back");
    }
}
