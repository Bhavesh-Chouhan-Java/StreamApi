package com.jalaramcwa.java.stream;

import com.jalaramcwa.java.example.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SynechronProgram {

    static  {
        System.out.println("Test1");
    }
    static{
        System.out.println("Test4");
    }
    public static void main(String[] args) {

        String s = "java is awesome";

        Map<Character, Long> collect = s.chars()
                .mapToObj(i -> (char) i)
                .filter(i->i != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((a,b)-> System.out.println(a+" : "+b));



        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1,"Honda1",100));
        personList.add(new Person(1,"Honda2",100));
        personList.add(new Person(1,"Honda3",100));
        personList.add(new Person(1,"Honda3",100));

        personList.stream().filter(i -> i.getSalary() > 99)
                .peek(person -> person.setSalary((person.getSalary() * 10/100) + person.getSalary()))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        personList.forEach(System.out::println);

    }
}
