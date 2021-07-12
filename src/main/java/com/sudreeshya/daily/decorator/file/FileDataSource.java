package com.sudreeshya.daily.decorator.file;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileDataSource implements DataSource {

    @Override
    public void writeData(String data) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            FileWriter myWriter = new FileWriter(classLoader.getResource(".").getFile() + "/decorator.txt");
            myWriter.write(data);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
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

        } catch (Exception ex) {
            System.out.println("An error occurred.");
            return "";
        }
        return str;
    }
}
