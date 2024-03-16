package com.jalaramcwa.java.citiustech;

import com.jalaramcwa.java.tables.Employee;

import java.util.*;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args)  {
        B b = new B();
        //b.m1(); //compile time error


        C p = new C();
        p.c2(); //compile time error

        X a = new X();
        a.m1(null);

        System.out.println("XYZ"+100+100);
        System.out.println(100+100+"XYZ");

        System.out.println("XYZ {} :"+100+100);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(123,"Bhavesh",10000.00));
        employees.add(new Employee(124,"Pooja",12000.00));
        employees.add(new Employee(125,"Grisha",11000.00));
        employees.add(new Employee(126,"Laisha",18000.00));

        Set<Employee> set = new HashSet<>();
        Predicate<Employee> predicate1 = e -> !set.add(e);

        Predicate<Employee> predicate = e -> e.getId() == 123;
        List<Employee> emplist = employees.stream().filter(predicate).toList();
        emplist.forEach(System.out::println);


        //way 1 object creation
        Employee e = new Employee(1,"bhav",10000.00);
        System.out.println("e :"+e);

        //way 2 object creation
        Employee e1 = e.clone();
        System.out.println("e1 :"+e1);

        //way 3 object creation
        Class<Employee> tClass = Employee.class;

        try {
            Employee employee = tClass.newInstance();
            employee.setName("ssa");
            employee.setSalary(12000.0);
            System.out.println("employee :"+employee);
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }

        //way 4 object creation
        e.serializePerson();
        Employee e2 = e.deserialize();
        e2.setName("ssa");
        e2.setSalary(12000.0);
        System.out.println("employee :"+e2);

    }
}
