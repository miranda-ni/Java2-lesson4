package com.company;

public class Student extends Person implements Printable {
    private int age;
    private int course;

    public Student(int age, String name, int course) {
        super(age, name);
        this.age = age;
        this.course = course;
    }

    public Student(int age, String name) {
        super(age, name);
    }

    @Override
    public void print() {
        System.out.println(" Возраст  " + age +
                "  Курс " + course);
    }
}


