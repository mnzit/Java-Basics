package com.sudreeshya.day5.playable;

import com.sudreeshya.day5.playable.Basketball;

// concrete - complete
public class BasketballV2 extends Basketball {

    @Override public void play() {
//        super.play();
        System.out.println("Adding new features in V2");
        flysBack();
    }

    private void flysBack(){
        System.out.println("Adding new features of flying back");
    }
}
