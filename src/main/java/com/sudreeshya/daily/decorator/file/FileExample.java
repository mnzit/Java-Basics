package com.sudreeshya.daily.decorator.file;

import java.io.File;
import java.io.FileWriter;
import java.security.Key;
import java.util.Scanner;

//  Voids SRP - OFE-CFM
public class FileExample {

    public String readData(String key) {
        String str = "";
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            File file = new File(classLoader.getResource("decorator.txt").getFile());
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                str += myReader.nextLine();
            }
            myReader.close();
            System.out.println("Successfully read from the file.");
            str = Aes.decrypt(str, key);

        } catch (Exception ex) {
            System.out.println("An error occurred.");
            return "";
        }
        return str;
    }

    public void writeData(String data, String key) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            FileWriter myWriter = new FileWriter(classLoader.getResource(".").getFile() + "/decorator.txt");
            String encrypted = Aes.encrypt(data, key);
            myWriter.write(encrypted);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        FileExample fileExample = new FileExample();
//        fileExample.writeData("ke xa keta/keti haru!!!",key);
        System.out.println(fileExample.readData("thebestsecretkey"));
    }
}
