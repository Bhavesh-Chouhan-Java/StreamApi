package com.jalaramcwa;

public class PersonDirector {
    private final PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public Person build(){
        return personBuilder.setName("Amit").setSalary(100000).build();
    }
}
