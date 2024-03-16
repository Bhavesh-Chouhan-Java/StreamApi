package com.jalaramcwa.java.test;

public class NewPerson implements PersonImp {
    @Override
    public String fetchData() {
        return loadData();
    }

    private String loadData(){
        return "ABC";
    }



}
