package com.jalaramcwa.java.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public class RohitClass implements Cloneable, Callable<RohitClass> {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RohitClass that = (RohitClass) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) throws Exception {

        RohitClass rohitClass = new RohitClass();
        rohitClass.setId("1");
        rohitClass.setName("Bhavesh");
        RohitClass rohit2 = new RohitClass();
        rohit2.setId("1");
        rohit2.setName("BhaveshChouhan");
        RohitClass rohitClass3 = (RohitClass) rohitClass.clone();


        RohitClass rohitClass4 = rohitClass.call();
        System.out.println(rohitClass.equals(rohitClass4));



        List<Number> numberList = new ArrayList<>();
        numberList.add(1.00f);
        rohitClass.adf(numberList);

        myStaticMethod("Bhavesh");
        myStaticMethod(100);
        myStaticMethod(Arrays.asList("1","2"));


    }

    public static <T> void myStaticMethod(T param){
        System.out.println("Parameter: " + param);
    }

    public void adf(List<Number> numberList){
        System.out.println(numberList);
    }

    @Override
    public RohitClass call() throws Exception {
        RohitClass rohitClass = new RohitClass();
        rohitClass.setId("1");
        rohitClass.setName("Bhavesh");
        return rohitClass;
    }
}
