package com.jalaramcwa.java.stream;

import com.jalaramcwa.java.stream.classes.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"AAA"));
        list.add(new Student(2,"BBB"));
        list.add(new Student(3,"CCC"));
        list.add(new Student(4,"DDD"));

        Map<Integer, Student> collect = list.stream().collect(Collectors.toMap(Student::getId, e -> e));
        collect.forEach((a,b)-> System.out.println(a+" : "+b.toString()));
    }
}
