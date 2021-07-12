package com.sudreeshya.daily.decorator.file;

public class DecoratorRealWorld {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource();
        dataSource = new EncryptionDecorator(dataSource, "thebestsecretkey");
        dataSource.writeData("Hello World!");
        System.out.println(dataSource.readData());
    }
}
