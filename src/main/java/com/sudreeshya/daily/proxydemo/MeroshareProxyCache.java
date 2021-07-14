package com.sudreeshya.daily.proxydemo;

public class MeroshareProxyCache implements Database {

    private final Database database = new MeroDatabase();

    private String[] participants;

//    public MeroshareProxyCache(Database database) {
//        this.database = database;
//    }

    @Override
    public String[] getDepositoryParticipant() {
        if (participants == null) {
            participants = database.getDepositoryParticipant();
        }
        return participants;
    }
}
