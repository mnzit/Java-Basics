package com.sudreeshya.daily.adapter.v2.external;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class MyFileReader implements FileReader {

    @Override
    public String[] read() {
        ClassLoader classLoader = getClass().getClassLoader();
        String[] lines = new String[1];
        try {
            File file = new File(classLoader.getResource("students.txt").getFile());
            java.io.FileReader fr = new java.io.FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream

            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i > 0) {
                    String[] temp = new String[i + 1];
                    for (int j = 0; j < lines.length; j++) {
                        temp[j] = lines[j];
                    }
                    i++;
                    temp[i - 1] = line;
                    lines = temp;
                }else {
                    lines[i] = line;
                    i++;
                }
            }
            fr.close();    //closes the stream and release the resources
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
