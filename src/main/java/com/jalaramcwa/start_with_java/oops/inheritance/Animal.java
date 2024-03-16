package com.jalaramcwa.start_with_java.oops.inheritance;

public class Animal {

    String species;

    public Animal(String species) {
        this.species = species;
    }

    public Animal(){
        System.out.println("Base Class");
    }


    public void makeSound(){
        System.out.println("Some Sound");
    }
}
