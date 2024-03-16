package com.jalaramcwa.java.stream;

import com.jalaramcwa.java.tables.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class ZensarTask {
    public static void main(String[] args) {


        List<Employee> list = new ArrayList<>();
        int[] course = {1,3,6,9,3,2};
        int[] course2 = {4,3,6,9,3,2};
        int[] course3 = {5,3,6,9,3,2};
        int[] course4 = {7,3,6,9,3,2};


        list.add(new Employee(1,"Bhavesh",10000.00,course,34));
        list.add(new Employee(2,"Pooja",9000.00,course2,34));
        list.add(new Employee(3,"Grisha",5000.00,course3,34));
        list.add(new Employee(4,"Laisha",7000.00,course4,34));


        Map<Integer, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getAge)); //.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 7000));

        //collect.forEach((a,b)-> System.out.println(a+" "+b.toString()));


        Map<Integer, Set<Employee>> collect1 = list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.toSet()));

        //collect1.forEach((a,b)-> System.out.println(a+" "+b.toString()));

        Map<Integer, List<String>> collect2 = list.stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getName, Collectors.toList())));
        //collect2.forEach((a,b)-> System.out.println(a+" "+b.toString()));


        Hashtable<Integer, List<Employee>> collect3 = list.stream().collect(Collectors.groupingBy(Employee::getAge, Hashtable::new, Collectors.toList()));

        //collect3.forEach((a,b)-> System.out.println(a+" "+b.toString()));

        Map<Boolean, List<Employee>> collect4 = list.stream().collect(Collectors.partitioningBy((i) -> i.getSalary() > 7000, Collectors.toList()));

        collect4.forEach((a,b)-> System.out.println(a+" "+b.toString()));



    }

}
