package com.jalaramcwa;

import com.jalaramcwa.tables.Employee;

import java.util.ArrayList;
import java.util.List;

public class PersistansProgram {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Bhavesh",1000.00));
        employees.add(new Employee(2,"Laisha",1300.00));
        employees.add(new Employee(3,"Grisha",900.00));
        employees.add(new Employee(3,"Pooja",1500.00));
        employees.add(new Employee(3,"Pooja",1200.00));


        List<String> list = employees.stream().filter(i -> i.getSalary() > 1200).map(Employee::getName).toList();
        list.forEach(System.out::println);

    }
}
