package com.sudreeshya.day5;

public class MainClass {

    private static long depth=0L;

    public static void main(String[] args){
        deep();
    }

    private static void deep(){
        System.err.println(++depth);// Info -> out,   Error -> err
        deep();
    }

}
