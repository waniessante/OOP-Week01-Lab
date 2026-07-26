/*
-----------------------------------------
Department of Computer Science
University of Karachi

Course : Object Oriented Programming
Lab : Week 1 Laboratory

Student Name : Wani
Seat No : XXXXX
Section : ___

File Name : Calculator.java
Purpose : Performs mathematical operations.
-----------------------------------------
*/

public class Calculator {

    // Adds two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Subtracts two numbers
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplies two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divides two numbers
    public double divide(double a, double b) {

        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }

        return a / b;
    }

    // Finds the remainder
    public double modulus(double a, double b) {
        return a % b;
    }

    // Calculates power
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Calculates average
    public double average(double a, double b) {
        return (a + b) / 2;
    }

    // Returns the maximum value
    public double maximum(double a, double b) {

        if (a > b)
            return a;

        return b;

    }

}
    

