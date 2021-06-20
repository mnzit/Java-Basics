package com.sudreeshya.day5;

import com.sudreeshya.day5.login.GithubLogin;
import com.sudreeshya.day5.login.GmailLogin;
import com.sudreeshya.day5.login.Login;
import com.sudreeshya.day5.playable.Playable;

public class Main {

    public static void main(String args[]) {
//        justPlay(new Guitar());

        Login login = new GithubLogin();
        login.process();
    }

    public static void justPlay(Playable playable) {
        playable.play();
    }
}
