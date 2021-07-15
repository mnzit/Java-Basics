package com.sudreeshya.daily.collections.list;


import java.util.Arrays;

public class CustomGenericArrayList<T> implements CustomList<T> {
    private Object[] collection = new Object[0];

    @Override
    public boolean add(T element) {
        try {
            if (collection.length == 0) {
                collection = new Object[1];
                collection[0] = element;
            } else {
                Object[] tempCollection = new Object[collection.length + 1];
                for (int i = 0; i < collection.length; i++) {
                    tempCollection[i] = collection[i];
                }
                tempCollection[collection.length] = element;
                collection = tempCollection;
            }
        } catch (Exception ex) {
            System.out.println("Exception : " + ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return collection.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(collection);
    }
}
