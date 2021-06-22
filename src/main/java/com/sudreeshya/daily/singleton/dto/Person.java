package com.sudreeshya.daily.singleton.dto;

// Singleton is only used when their is no state variable
public class Person{

//    private static Long id = 0L;
//    private String name;
//    private String address;
//    private String contactNo;

    private static Person instance = null;

    private Person() {
    }
//
    public static Person getInstance(){
        if(instance == null){
            instance = new Person();
        }
        return instance;
    }

    public void callDatabase(){

    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getContactNo() {
//        return contactNo;
//    }
//
//    public void setContactNo(String contactNo) {
//        this.contactNo = contactNo;
//    }

//    @Override public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", contactNo='" + contactNo + '\'' +
//                '}';
//    }
}
