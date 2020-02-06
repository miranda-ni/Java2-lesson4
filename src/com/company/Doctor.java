package com.company;

public class Doctor extends Person implements Printable {
    private int age;
    private String profession;

    public Doctor(int age, String name,  String profession) {
        super(age, name);
        this.age = age;
        this.profession = profession;
    }

    public Doctor(int age, String name) {
        super(age, name);
    }

    @Override
    public void print() {
        System.out.println("  Возраст  " + age +
                "  Профессия  " +profession);
    }
}
