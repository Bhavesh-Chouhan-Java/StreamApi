package com.jalaramcwa.start_with_java.oops.polymorphism;

public class PolymorphismProgram {

    // todo
    // Polymorphism in Java refers to the ability of a single entity (such as a method or class) to take on multiple forms.
    // This allows objects to be treated as instances of their parent class or as instances of their subclass.
    // There are two types of polymorphism in Java:
    // compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(10,20);
        int sum1 = calculator.add(10,20,30);
        double sum2 = calculator.add(10.00,20.00);

        System.out.println("SUM -> "+sum);
        System.out.println("SUM1 -> "+sum1);
        System.out.println("SUM2 -> "+sum2);


        Animal animal = new Dog();
        animal.makeSound();

        Animal animal1 = new Cat();
        animal1.makeSound();
    }

    //todo Compile time polymorphism
    public static class Calculator {

        public int add(int a, int b){
            return a+b;
        }

        public int add(int a, int b, int c){
            return a+b+c;
        }

        public double add(double a, double b){
            return a+b;
        }

    }

    //todo Runtime polymorphism
    public static class Animal {
        public void makeSound() {
            System.out.println("Some sound");
        }
    }

    public static class Dog extends Animal{
        @Override
        public void makeSound() {
            super.makeSound();
            System.out.println("Bark");
        }
    }

    public static class Cat extends Animal{
        @Override
        public void makeSound() {
            super.makeSound();
            System.out.println("Meow");
        }
    }



}
