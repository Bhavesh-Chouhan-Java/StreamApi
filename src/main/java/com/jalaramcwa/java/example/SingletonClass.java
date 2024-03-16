package com.jalaramcwa.java.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonClass {

    private SingletonClass(){}

    private static SingletonClass singletonClass;

    public static  SingletonClass getSingletonClass() {
        if (singletonClass == null){
            synchronized (SingletonClass.class) {
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass singletonClass1 = getSingletonClass();
        SingletonClass singletonClass2 = null;

        try{
            Constructor<?>[] constructors = SingletonClass.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                singletonClass2 = (SingletonClass) constructor.newInstance();
                break;
            }

        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(singletonClass1.hashCode());
        System.out.println(singletonClass2.hashCode());
    }

}
