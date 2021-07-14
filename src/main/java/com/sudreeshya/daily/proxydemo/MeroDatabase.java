package com.sudreeshya.daily.proxydemo;

public class MeroDatabase implements Database{

    @Override
    public String[] getDepositoryParticipant() {
        System.out.println("Fetching participants from database");
        try {
            Thread.sleep(9000);
        } catch (Exception e) {
        }

        String[] participants = new String[3];
        participants[0] = "ABC SECURITIES PRIVATE LIMITED";
        participants[1] = "AGRAWAL SECURITIES PRIVATE LIMITED";
        participants[2] = "AGRICULTURAL DEVELOPMENT BANK LIMITED";
        System.out.println("Fetched participants from database");
        return participants;
    }
}
