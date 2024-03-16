package com.jalaramcwa.java.test;

public class PersonClass {
    private final PersonImp personImp;

    public PersonClass(PersonImp personImp) {
        this.personImp = personImp;
    }



    public String callApi(){
        return personImp.fetchData();
    }
}
