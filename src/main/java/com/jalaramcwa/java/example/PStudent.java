package com.jalaramcwa.java.example;

import java.util.Objects;

public class PStudent implements Comparable<PStudent>{

    private int id;
    private String name;
    private int grade;

    private String exam;

    public PStudent(int id, String name, int grade, String exam) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.exam = exam;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "PStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", exam='" + exam + '\'' +
                '}';
    }


    @Override
    public int compareTo(PStudent o) {
        return this.compareTo(o);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PStudent pStudent = (PStudent) o;
        return id == pStudent.id && grade == pStudent.grade && Objects.equals(name, pStudent.name) && Objects.equals(exam, pStudent.exam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade, exam);
    }
}
