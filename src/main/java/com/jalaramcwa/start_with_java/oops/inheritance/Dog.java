package com.jalaramcwa.start_with_java.oops.inheritance;

public class Dog extends Animal{

    public Dog(){
        super("Dog");
        System.out.println("Sub Dog class of Animal");
    }
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Bow Bow...");
    }

}
