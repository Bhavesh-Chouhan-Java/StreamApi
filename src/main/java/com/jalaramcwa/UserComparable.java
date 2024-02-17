package com.jalaramcwa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserComparable implements Comparable<UserComparable>{
    private int id;
    private String name;
    private int age;
    private double salary;

    public UserComparable(){}

    public UserComparable(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "UserComparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(UserComparable o) {
        return Integer.compare(this.id,o.id);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        ArrayList<UserComparable> arrayList = new ArrayList<>();
        arrayList.add(new UserComparable(11,"Bhavesh",35,10000));
        arrayList.add(new UserComparable(10,"Pooja",34,12000));
        arrayList.add(new UserComparable(12,"Grisha",20,11000));
        arrayList.add(new UserComparable(9,"Laisha",26,9000));
        arrayList.removeIf(next -> next.id == 9);

        //Collections.sort(arrayList);
        //arrayList.sort(Comparator.comparingDouble(UserComparable::getSalary));

        //arrayList.forEach(System.out::println);

        Collections.sort(arrayList);
        Collections.sort(arrayList,Comparator.comparingDouble(UserComparable::getSalary));
        Collections.sort(arrayList,Collections.reverseOrder());

        Comparator<UserComparable> comparator = new Comparator<UserComparable>() {
            @Override
            public int compare(UserComparable o1, UserComparable o2) {
                return Integer.compare(o1.id,o2.id);
            }
        };
        arrayList.sort(comparator);
        arrayList.forEach(System.out::println);




        int i = 10;
        int m = i++;
        System.out.println(m);




    }



}