package com.jalaramcwa.java.example;

public class Person {
    private int id;
    private String name;
    private double salary;

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }



    public static class Builder{
        private int id;
        private String name;
        private double salary;

        public Builder(){}

        public Builder(int id){
            this.id = id;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setSalary(double salary){
            this.salary = salary;
            return this;
        }

        public Person build(){
            return new Person(id,name,salary);
        }
    }
}
