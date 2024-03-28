package com.jalaramcwa.java.example;

import com.jalaramcwa.java.example.clasess.Person;

public class MyClass {
    private String privateField;

    public String getPrivateField() {
        return privateField;
    }

    public static void main(String[] args) {
        Person.newBuilder().setAddress("").setAge(40).setEmail("").setFirstName("").setLastName("").build();
    }
}
