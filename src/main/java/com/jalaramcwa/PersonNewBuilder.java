package com.jalaramcwa;

public class PersonNewBuilder implements PersonBuilder{

    private int id;
    private String name;
    private double salary;
    @Override
    public PersonBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public Person build() {
        return new Person(id,name,salary);
    }
}
