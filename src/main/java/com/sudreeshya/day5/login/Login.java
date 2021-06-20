package com.sudreeshya.day5.login;

// not 100%
public abstract class Login implements LoginContract {

    @Override
    public void isValidUser() {
        System.out.println("checks if the user is in our database");
    }

    public void process() {
        fetchFromSource();
        isValidUser();
    }
}
