package com.sudreeshya.daily.collections.list;

public class ListTester {
    public static void main(String[] args) {



//        List<String> names = new ArrayList<>();
//        names.add("Manjit");
//        names.add("Manjit");
//        System.out.println(names);


        CustomList<Integer> ages = new CustomGenericArrayList<>();

        ages.add(22);
        ages.add(21);
        ages.add(25);
        ages.add(26);
        ages.add(78);

//        System.out.println(ages);

        // Iterator Design Pattern and iterator will be added in array list
        while(ages.hasNext()){
            System.out.println(ages.next());
        }

    }
}
