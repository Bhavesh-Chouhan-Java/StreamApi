package com.jalaramcwa;

import java.io.*;

public class TransientExample implements Serializable {
    private String name;
    private transient int age;
    private volatile int id;
    public TransientExample(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "TransientExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args)  {
        TransientExample te = new TransientExample("Bhavesh",34,1);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(te);
            outputStream.flush();
            outputStream.close();
            System.out.println("Success");


            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
            TransientExample object = (TransientExample) objectInputStream.readObject();
            System.out.println("Success "+object);
            objectInputStream.close();


            SingletonExample.getInstance().setClassName("SingletonExample");
            System.out.println(SingletonExample.getInstance().getClassName());

            //way 1
            Person bhavesh = new Person.Builder().setSalary(100000).setName("bhavesh").build();

            //way 2
            Person person = new PersonNewBuilder().setId(1).setName("Ragini").setSalary(100000).build();

            //way 3
            PersonBuilder personBuilder = new PersonNewBuilder();
            PersonDirector personDirector = new PersonDirector(personBuilder);
            Person person3 = personDirector.build();

            //way 4
            Person person1 = personBuilder.setId(1).setName("Anjali").setSalary(100000).build();

        } catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }
    }
}
