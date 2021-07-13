package com.sudreeshya.daily.decoratordemo.file.source;

public interface DataSource {

    void writeData(String data);

    String readData();
}
