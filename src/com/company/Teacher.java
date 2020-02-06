package com.company;

public class Teacher extends Person implements Printable {
    private int standing;
    private String profession;

    public Teacher(int age, String name, int standing, String profession) {
        super(age, name);
        this.standing = standing;
        this.profession = profession;
    }

    public Teacher(int age, String name) {
        super(age, name);
    }

    @Override
    public void print() {
        System.out.println( " Стаж работы  " +standing +
                " Профессия  " + profession);
    }
}
