package com.jalaramcwa.start_with_java.oops.inheritance;

public class InheritanceProgram {

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        System.out.println(" "+dog.species);
        System.out.println(" "+cat.species);

    }
}
