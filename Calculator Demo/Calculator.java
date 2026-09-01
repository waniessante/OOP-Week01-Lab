/*
-----------------------------------------
Department of Computer Science
University of Karachi

Course : Object Oriented Programming
Lab : Week 1 Laboratory

Student Name : Wania Batool
Seat No : B25110006171
Section : A

File Name : Calculator.java
Purpose : Performs mathematical operations.
-----------------------------------------
*/

public class Calculator {

    // Attributes
    private double num1;
    private double num2;

    // Constructor
    public Calculator() {
        num1 = 0;
        num2 = 0;
    }
        // Getters 
          public double getNum1() {
          return num1;
    }       
          public double getNum2() { 
          return num2; 
    }      
    // Setters 
        public void setNum1(double num1) {
        this.num1 = num1; 
    }
        public void setNum2(double num2) { 
        this.num2 = num2;
    }
    // Adds two numbers
    public double add(double a, double b) {
        num1 = a;
        num2 = b;
        return num1 + num2;
    }

    // Subtracts two numbers
    public double subtract(double a, double b) {
        num1 = a;
        num2 = b;
        return num1 - num2;
    }

    // Multiplies two numbers
    public double multiply(double a, double b) {
        num1 = a;
        num2 = b;
        return num1 * num2;
    }

    // Divides two numbers
    public double divide(double a, double b) {

        num1 = a;
        num2 = b;

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }

        return num1 / num2;
    }

    // Finds the remainder
    public double modulus(double a, double b) {
        num1 = a;
        num2 = b;
        return num1 % num2;
    }

    // Calculates power
    public double power(double a, double b) {
        num1 = a;
        num2 = b;
        return Math.pow(num1, num2);
    }

    // Calculates average
    public double average(double a, double b) {
        num1 = a;
        num2 = b;
        return (num1 + num2) / 2;
    }

    // Returns the maximum value
    public double maximum(double a, double b) {

        num1 = a;
        num2 = b;

        if (num1 > num2)
            return num1;

        return num2;
    }

}

