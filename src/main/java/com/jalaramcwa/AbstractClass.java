package com.jalaramcwa;

public abstract class AbstractClass {
    public int iAmAbstractVariable = 10;
    AbstractClass(){
        System.out.println(iAmAbstractVariable);
    }


    abstract void iAmAbstractMethod();

    //Concrete Method
    public int iAmConcrete(){
        return iAmAbstractVariable + 10;
    }
}
