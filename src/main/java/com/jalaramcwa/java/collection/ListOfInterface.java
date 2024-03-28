package com.jalaramcwa.java.collection;

import java.util.*;

public class ListOfInterface {
    public static void main(String[] args) {

        Collection<Integer> integerCollection = new ArrayList<>();


        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(1);

        list.add(5,7);

        System.out.println(list);

        List<Integer> list1 = new ArrayList<>(Collections.unmodifiableList(list));
        list1.set(2,3);
        System.out.println(list1);

        //System.out.println(list);
        //Collections.sort(list);
        //list.sort(Collections.reverseOrder());
        //list.sort(Comparator.comparingInt(Integer::intValue));
        //list.sort(Comparator.naturalOrder());
        //list.sort(Comparator.reverseOrder());
        //list.sort(Integer::compareTo);

        //System.out.println(list);

        //list.forEach(System.out::println);

        //insertion or deletion

        Set<Integer> set = new HashSet<>();

        //System.out.println(set.size());


        HashMap<String, String> hashMap = new HashMap<>();

        int size = hashMap.size();



        System.out.println("The size of the HashMap is: " + size);



    }


}
