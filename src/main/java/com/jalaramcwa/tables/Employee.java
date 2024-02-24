package com.jalaramcwa.tables;




import java.io.*;
import java.util.Arrays;

public class Employee implements Comparable<Employee>,Cloneable, Serializable {
    int id;
    String name;
    Double salary;
    int age;

    int[] course;

    public Employee(){}

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name, Double salary, int[] course,int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.course = course;
        this.age = age;
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int[] getCourse() {
        return course;
    }

    public void setCourse(int[] course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", course=" + Arrays.toString(course) +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void serializePerson() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            Employee person = new Employee();
            oos.writeObject(person);
            System.out.println("Employee object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Employee deserialize(){
        Employee employee = null;
        try(ObjectInputStream outputStream = new ObjectInputStream(new FileInputStream("employee.ser"))){
            employee = (Employee) outputStream.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return employee;
    }




}
