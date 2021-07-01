package com.sudreeshya.daily.prototype.v2;

public class PrototypeMainV2 {

    public static void main(String[] args) {
        Human human1 = new Human("Anil", "Kumar", 30);

        Human human2 = (Human) human1.getClone();
        Human human3 = (Human) human1.getClone();
        Human human4 = (Human) human1.getClone();
        Human human5 = (Human) human1.getClone();
        Human human6 = (Human) human1.getClone();
    }
}
