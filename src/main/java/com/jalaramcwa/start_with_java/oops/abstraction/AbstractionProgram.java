package com.jalaramcwa.start_with_java.oops.abstraction;

public class AbstractionProgram {

    public static void main(String[] args) {
        //todo help of abstract class
        ChildClass childClass = new ChildClass();
        childClass.makeMethod();
        childClass.baseClass();



        //todo help of interface
        HondaCar car = new HondaCar();
        car.start();
        car.stop();

        MarutiCar marutiCar = new MarutiCar();
        marutiCar.start();
        marutiCar.stop();
    }
}
