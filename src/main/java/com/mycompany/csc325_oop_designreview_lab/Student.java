/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
// "extends Human" makes the Student class a child of Human
public class Student extends Human {
    // create field for gpa
    private double gpa;
    // getter method for gpa
    public double getGpa() {
        return gpa;
    }
    // setter method for gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    // constructor initializes Student by calling constructor of
    // super class Human
    public Student (String name, short age) {
        super(name, age);
    }
    // overrides getAddress method inherited from Human
    // class since it returns null
    @Override
    public String getAddress() {
        return null;
    }
    // overrides setAddress method inherited from Human
    // class since it does nothing
    @Override
    public void setAddress(String address) {
    }
    // toString will return a String representation of the Student
    // Override because it will be a custom String representation of Student
    @Override
    public String toString() {
        return "Student: {" +
                "Name = " + getName() +
                ", Age = " + getAge() +
                ", GPA = " + gpa +
                '}';
    }
}
