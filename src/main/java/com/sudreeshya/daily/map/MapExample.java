package com.sudreeshya.daily.map;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // TreeMap (If you need keys sorted use this) and HashMap (If you want to search the data as fast as possible)

        Map<Long, String> map = new TreeMap<>();

        map.put(1L,"Manjit");
        map.put(2L,"Vanjit");
        map.put(3L,"Aanjit");
        map.put(4L,"Xanjit");
        map.put(5L,"Fanjit");
        map.put(6L,"Ganjit");
        map.put(90L,"Ganjit");
        map.put(91L,"Ganjit");
        System.out.println(map);
    }
}
