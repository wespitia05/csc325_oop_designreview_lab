package com.mycompany.csc325_oop_designreview_lab;

// Freshman class is a child of the Student class
public class Freshman extends Student {
    // create field for credits, is private because will be
    // for freshman specifically only
    private int credits;
    // constructor initializes Freshman by calling constructor of
    // super class Student
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    // toString will return a String representation of the Freshman
    // Override because it will be a custom String representation of Freshman
    @Override
    public String toString() {
        return "Freshman: {" +
                "Name = " + getName() +
                ", Age = " + getAge() +
                ", GPA = " + getGpa() +
                ", Credits = " + credits +
                '}';
    }
}
