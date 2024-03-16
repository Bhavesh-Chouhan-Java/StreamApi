package com.jalaramcwa.start_with_java.oops.inheritance;

public class Cat extends Animal {

    public Cat(){
        super("Cat");
        System.out.println("Sub Cat class of Animal");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Mow Mow...");
    }
}
