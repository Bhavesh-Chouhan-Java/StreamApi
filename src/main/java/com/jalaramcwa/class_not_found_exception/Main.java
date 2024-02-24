package com.jalaramcwa.class_not_found_exception;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.jalaramcwa.soild.liskov_substitution_principle.Shapes");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Helper helper = new Helper();
            helper.doSomething();
        }  catch (NoClassDefFoundError e) {
            e.printStackTrace();
        }

        Main main = new Main();
        main.infiniteRecursion();
    }

    public void infiniteRecursion() {
        // This method calls itself recursively without a termination condition
        infiniteRecursion();
    }
}
