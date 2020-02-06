package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Student").print();
        createObject("Teacher").print();
        createObject("Doctor").print();


    }
    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Person":
                printable = (Printable) new Person(20, "Azamat");
                break;
            case "Student":
                printable = new Student(21, "Ali", 3);
                break;
            case "Teacher":
                printable = new Teacher(30, "Aliya", 5, "English");

                break;
            case "Doctor":
                printable = new Doctor(29, "Timur", "Dentist");
                break;
        }
        return printable;
    }
}