package com.jalaramcwa;

import java.util.*;
import java.util.stream.Collectors;

public class PresistenceProgram {
    public static void main(String[] args) {

        //Student     Exam    Grade
        //John        Phy     45
        //Dave        Phy     67
        //Dave        Maths   82
        //John        Maths   91
        //Chris       Eng     70
        //John        Eng     88

        //Expected output
        //Exam    Student     Grade
        //Phy     Dave        67
        //Maths   John        91
        //Eng     John        88

        List<PStudent> list = new ArrayList<>();
        list.add(new PStudent(1,"John",45,"Phy"));
        list.add(new PStudent(1,"Dave",67,"Phy"));
        list.add(new PStudent(1,"Dave",82,"Maths"));
        list.add(new PStudent(1,"John",91,"Maths"));
        list.add(new PStudent(1,"Chris",70,"Eng"));
        list.add(new PStudent(1,"John",88,"Eng"));

        Map<String, Set<PStudent>> collect = list.stream().collect(Collectors.groupingBy(i -> i.getExam(), Collectors.toSet()));
        //collect.forEach((a,b)-> System.out.println(b.stream().limit(1).toList()));

        Map<String, Set<PStudent>> collect1 = list.stream().collect(Collectors.groupingBy(i -> i.getExam(), Collectors.toSet()));
        collect1.forEach((a,b)-> System.out.println(b.stream().limit(1).toList()));



        //Output
        //[PStudent{id=1, name='Dave', grade=67, exam='Phy'}]
        //[PStudent{id=1, name='John', grade=91, exam='Maths'}]
        //[PStudent{id=1, name='John', grade=88, exam='Eng'}]

    }
}
