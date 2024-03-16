package com.jalaramcwa.start_with_java.oops.abstraction;

public class ChildClass extends BaseClass {
    @Override
    public void makeMethod() {
        System.out.println("Child class override method");
    }

    @Override
    public void baseClass() {
        super.baseClass();
        System.out.println("Child class override BaseClass class method in sub class ");
    }
}
