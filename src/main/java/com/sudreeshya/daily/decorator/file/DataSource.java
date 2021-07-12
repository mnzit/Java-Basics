package com.sudreeshya.daily.decorator.file;

public interface DataSource {

    void writeData(String data);

    String readData();
}
