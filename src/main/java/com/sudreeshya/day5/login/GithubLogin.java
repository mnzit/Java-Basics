package com.sudreeshya.day5.login;

public class GithubLogin extends Login{

    @Override
    public void fetchFromSource() {
        System.out.println("pull the user credential from github");
    }
}
