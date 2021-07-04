package com.sudreeshya.daily.adapter.v2;

import com.sudreeshya.daily.adapter.v2.external.FileReader;

public class MyAdapter implements DatabaseReader {

    private FileReader fileReader;

    public MyAdapter(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    @Override
    public Object executeQuery() {
        String[] lines = fileReader.read();
        Student[] students = new Student[lines.length];
        int i = 0;
        for (String s : lines) {
            String[] studentLine = s.split(",");
            Student student = new Student();
            student.setId(Long.valueOf(studentLine[0]));
            student.setFname(studentLine[1]);
            student.setLname(studentLine[2]);
            student.setGender(studentLine[3]);
            student.setAge(Integer.valueOf(studentLine[4]));
            students[i++] = student;
        }
        return students;
    }
}
