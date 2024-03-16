package com.jalaramcwa.java.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApiExample {
    public static void main(String[] args) {
        Class<?> comparableClass = Comparable.class;
        Class<?> userComparableClass = UserComparable.class;
        boolean assignableFrom = (boolean) comparableClass.isAssignableFrom(userComparableClass);
        System.out.println(assignableFrom);

        UserComparable userComparable = new UserComparable();
        Method setName = null;
        try {
            setName = userComparableClass.getMethod("setName", String.class);
            setName.invoke(userComparable,"Bhavesh");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
