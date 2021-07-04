package com.sudreeshya.daily.adapter.v2;

import com.sudreeshya.daily.adapter.v2.external.FileReader;
import com.sudreeshya.daily.adapter.v2.external.MyFileReader;

public class AdapterV2Main {

    public static void main(String args[]){
        FileReader fileReader = new MyFileReader();

       for(String s: fileReader.read()){
           System.out.println(s);
       }

        DatabaseReader databaseReader = new MyAdapter(new MyFileReader());
        Student[] students = (Student[]) databaseReader.executeQuery();
        for(Student student: students){
            System.out.println(student);
        }

    }
}
