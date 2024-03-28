package com.jalaramcwa.java.example.clasess;



public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;
    private final String address;

    private  Person(Builder b){
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.age = b.age;
        this.email = b.email;
        this.address = b.address;
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder{

        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String address;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        private Builder() {}



        public Person build(){
            return new Person(this);
        }
    }

}
