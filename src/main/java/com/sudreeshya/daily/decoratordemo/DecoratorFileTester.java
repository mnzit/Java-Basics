package com.sudreeshya.daily.decoratordemo;

import com.sudreeshya.daily.decoratordemo.file.decorator.EncryptionDecorator;
import com.sudreeshya.daily.decoratordemo.file.source.DataSource;
import com.sudreeshya.daily.decoratordemo.file.source.impl.FileDataSource;

public class DecoratorFileTester {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource();
        dataSource = new EncryptionDecorator(dataSource, "thebestsecretkey");
        dataSource.writeData("Hello World!");
        System.out.println(dataSource.readData());
    }
}
