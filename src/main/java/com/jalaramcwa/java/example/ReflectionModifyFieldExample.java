package com.jalaramcwa.java.example;

import java.lang.reflect.Field;

public class ReflectionModifyFieldExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Class<?> myClass1 = MyClass.class;
        try {
            Field field = myClass1.getDeclaredField("privateField");
            field.setAccessible(true);
            field.set(myClass,"Bhavesh");
            System.out.println(field.get(myClass));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
