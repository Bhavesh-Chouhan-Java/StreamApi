package com.jalaramcwa.java.stream;
import com.jalaramcwa.java.example.CloneUser;
import com.jalaramcwa.java.example.UserBuilderPattern;
import com.jalaramcwa.java.tables.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000.00));
        employees.add(new Employee("Bob", 45000.00));
        employees.add(new Employee("Charlie", 60000.00));

        Collections.sort(employees);

        employees.sort(Comparator.comparingDouble(Employee::getSalary));

        employees.sort(Comparator.naturalOrder());

        employees.sort(Employee::compareTo);

        Map<Employee, Long> collect = employees.stream().filter(e -> e.getSalary() >= 5000).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((a,b)-> System.out.println(a));


        //Collections.sort(employees);
        //Collections.sort(employees,Comparator.comparingDouble(Employee::getSalary));

        //employees.sort(Comparator.comparing(Employee::getName));
        //employees.forEach(System.out::println);
        //employees.sort(Comparator.comparingDouble(Employee::getSalary));
        //employees.forEach(System.out::println);
        int[] in = {1,2,3};
        int size = in.length;
        String[] arrStr = {"Bhavesh","Chouhan","Laisha"};
        int employeeSize = employees.size();
        int strLength = arrStr.length;

        //List<String> Arrays.asList(arrStr);


        UserBuilderPattern pooja = new UserBuilderPattern.Builder().setId(1).setName("Pooja").setAge("18").build();
        try{
            CloneUser user = (CloneUser) new CloneUser().clone();
            System.out.println(user);
        }catch (CloneNotSupportedException c){
            System.out.println("CloneNotSupport : "+c.getMessage());
        }


    }
}
