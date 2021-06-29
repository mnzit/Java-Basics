package com.sudreeshya.daily.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape implements Cloneable {

    protected String type;
    protected String data;
    private Integer size;

    public Shape() {
        stimulateHittingTheDatabase();
    }

    abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Exception : " + e);
        }
        return clone;
    }

    public void stimulateHittingTheDatabase() {
        try {
            System.out.println("Hitting the database");
            Thread.sleep(1000);
            data = "the heavy data";
            System.out.println("Ended hitting the database");
        } catch (Exception e) {
            System.out.println("Handled the error");
        }
    }

    @Override public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
