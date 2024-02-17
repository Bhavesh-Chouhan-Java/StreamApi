package com.jalaramcwa;

public interface PersonBuilder {
    PersonBuilder setId(int id);
    PersonBuilder setName(String name);
    PersonBuilder setSalary(double salary);

    Person build();
}
