package com.sudreeshya.daily.serializationdeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationDeserializationFileDemo {

    public static void main(String[] args) {
        // Object -> Bytes/String = Serialization
        // Bytes/String -> Object = Deserialization

//        UserData anishData = UserData
//                .builder()
//                .username("Anish")
//                .highScore(100231L)
//                .totalGamePlayed(10)
//                .level(5)
//                .build();
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("D:\\UserData\\anish.data");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(anishData);
//            objectOutputStream.close();
//            fileOutputStream.close();
//        }catch(Exception ex){
//            System.out.println(ex);
//        }
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\UserData\\anish.data");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            UserData userData = (UserData) objectInputStream.readObject();
            System.out.println(userData);
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
