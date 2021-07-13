package com.sudreeshya.daily.decoratordemo.file.decorator;

import com.sudreeshya.daily.decoratordemo.file.source.DataSource;
import com.sudreeshya.daily.decoratordemo.file.util.Aes;

public class EncryptionDecorator extends DataSourceDecorator {

    private String secretKey;

    public EncryptionDecorator(DataSource dataSource, String secretKey) {
        super(dataSource);
        this.secretKey = secretKey;
    }

    @Override
    public void writeData(String data) {
        try {
            dataSource.writeData(Aes.encrypt(data, secretKey));
        } catch (Exception ex) {
            System.out.println("Error Encrypting the file");
        }
    }

    @Override
    public String readData() {
        try {
            return Aes.decrypt(dataSource.readData(), secretKey);
        } catch (Exception ex) {
            System.out.println("Error Decrypting the file");
            return "";
        }
    }
}
