package com.jalaramcwa.java.example;

public class SubAbstractClass extends AbstractClass{

    public int iAmAbstractVariable = 20;

    SubAbstractClass(){
        System.out.println(iAmAbstractVariable);
    }

    @Override
    void iAmAbstractMethod() {

    }

    //Concrete Method
    @Override
    public int iAmConcrete() {
        int value = super.iAmConcrete();
        System.out.println(" value : "+value);
        return value;
    }

    public static void main(String[] args) {
        int v = new SubAbstractClass().iAmConcrete();
        System.out.println(v);
    }
}
