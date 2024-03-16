package com.jalaramcwa.start_with_java.oops.encapsulation;

public class EncapsulationProgram {
    //todo
    // Encapsulation provides several benefits, including:
    // 1. Data Hiding
    // 2. Controlled Access
    // 3. Modularity

    private int id;
    private String name;
    private String email;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
