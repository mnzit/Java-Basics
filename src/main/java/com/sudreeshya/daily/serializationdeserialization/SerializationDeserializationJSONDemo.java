package com.sudreeshya.daily.serializationdeserialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationDeserializationJSONDemo {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        // Serialization

        Staff staff1 = new Staff(1L, "Anish", "Babelo");

        try {
            String json = objectMapper.writeValueAsString(staff1);
            System.out.println(json);
        } catch (Exception ex) {
            System.out.println(ex);
        }


        // Deserialization
        String json = "{\n" +
                "  \"id\": 1,\n" +
                "  \"name\": \"Punam\",\n" +
                "  \"departmentName\": \"Carlos\"\n" +
                "}";
        try {
            Staff staff = objectMapper.readValue(json, Staff.class);
            System.out.println(staff);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
