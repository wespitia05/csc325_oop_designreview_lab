package com.mycompany.csc325_oop_designreview_lab;

// Senior class is a child of Student
public class Senior extends Student {
    // create field for minimum credits for Senior
    // is private and final because it declares the
    // minimum amount of credits to be 85
    private static final int minCredits = 85;
    // create field for credits, is private because will be for
    // senior use only
    private int credits;
    // constructor initializes Senior by calling constructor of
    // super class Student
    public Senior(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
        // checks if the student has enough credits, if student has less than the minimum
        // amount of credits then it will throw an illegal argument exception
        if (credits < minCredits) {
            throw new IllegalArgumentException("Senior students must have at least " + minCredits + " credits, " +
                    "student has " + credits + " credits.");
        }
    }
    // toString will return a String representation of the Senior
    // Override because it will be a custom String representation of Senior
    @Override
    public String toString() {
        // lets us know that the senior has more than the minimum number of credits
        System.out.println ("Senior student has " + credits + " credits, which is more than the minimum required " +
                "credits of " + minCredits + " credits");
        return "Senior: {" +
                "Name = " + getName() +
                ", Age = " + getAge() +
                ", GPA = " + getGpa() +
                ", Credits = " + credits +
                '}';
    }
}
