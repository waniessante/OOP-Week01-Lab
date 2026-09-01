 /*
-----------------------------------------
Department of Computer Science
University of Karachi

Course : Object Oriented Programming
Lab : Week 1 Laboratory

Student Name : Wania Batool
Seat No : B25110006171
Section : _A_

File Name : Main.java
Purpose : Tests the Calculator class.
-----------------------------------------
*/

public class Main {
   public static void main(String[] args) {
        // Create the calculator object
        Calculator calc = new Calculator();

        // Run and print each math operation
        System.out.println("Addition = " + calc.add(10, 5));
        System.out.println("Subtraction = " + calc.subtract(20, 8));
        System.out.println("Multiplication = " + calc.multiply(7, 4));
        System.out.println("Division = " + calc.divide(10, 2));
        System.out.println("Division by zero = " + calc.divide(10, 0)); // Edge case check
        System.out.println("Modulus = " + calc.modulus(17, 5));
        System.out.println("Power = " + calc.power(2, 5));
        System.out.println("Average = " + calc.average(10, 20));
        System.out.println("Maximum = " + calc.maximum(50, 25));

        // Test Getter and Setter once at the end
        calc.setNum1(100);
        System.out.println("New num1 value = " + calc.getNum1());
    }
}
    

