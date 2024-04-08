/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 // creates instance of Student in variable std1
	 // holds name of student James, age 20
	 Student std1= new Student("James",  (short) 20);
	 // creates instance of Freshman in variable std2
	 // holds name of freshman Jake, age 20 and with 12 credits
	 Freshman std2= new Freshman("Jake", (short) 20, 12);
	 // creates instance of Senior in variable std3
	 // holds names of senior John, age 30 and with 90 credits
	 Senior std3 = new Senior("John", (short) 30, 90);
	 // declare new Scanner scnr
	 Scanner scnr = new Scanner(System.in);
	 // asks user to input gpa for student
	 System.out.print("Enter GPA for student " + std1.getName() + ": ");
	 double gpas1 = scnr.nextDouble(); // assigns user input to gpas1
	 std1.setGpa(gpas1); // stores the gpa by calling the set method
	 System.out.println(std1); // prints the toString for student
	 // asks user to input gpa for freshman
	 System.out.print("Enter GPA for freshman " + std2.getName() + ": ");
	 double gpas2 = scnr.nextDouble(); // assigns user input to gpas2
	 std2.setGpa(gpas2); // stores the gpa by calling the set method
	 System.out.println(std2); // prints the toString for freshman
	 // asks user input for senior
	 System.out.print("Enter GPA for senior " + std3.getName() + ": ");
	 double gpas3 = scnr.nextDouble(); // assigns user input to gpas3
	 std3.setGpa(gpas3); // stores the gpa by calling the set method
	 System.out.println (std3); // prints the toString for senior
	}
}

