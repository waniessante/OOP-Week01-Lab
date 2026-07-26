
/*
-----------------------------------------
Department of Computer Science
University of Karachi

Course : Object Oriented Programming
Lab : Week 1 Laboratory

Student Name : Wania Batool 
Seat No : B25110006171
Section : A

File Name : Main.java
Purpose : Driver program that creates and interacts with Car objects.
-----------------------------------------
*/

public class Main {
    public static void main(String[] args) {

        // 1. Create two separate Car objects
        // // Instantiation: creates a new Car object in Heap memory
        Car car1 = new Car();

       // car1 is a reference variable stored in Stack memory
        Car car2 = new Car();

        // 2. Assign unique details using setDetails
         car1.setDetails( "Honda Civic", "Black");
         car2.setDetails("Toyota Corolla", "White");

        // 3. Display initial states of both objects
        System.out.println("=== INITIAL STATES ===");
        car1.displayState();
        car2.displayState();

        // 4. Test state rules (attempting movement while engine is OFF)
        System.out.println("=== TESTING ENGINE OFF CONSTRAINTS ===");
        car1.drive();
        car1.moveFast();
        System.out.println();

        // 5. Start engine for car1
        System.out.println("=== STARTING ENGINE ===");
        car1.startEngine();
        car1.startEngine(); // Testing duplicate start attempt
        System.out.println();

        // 6. Demonstrate movement and feature behaviours on car1
        System.out.println("=== CAR 1 MOVEMENTS & FEATURES ===");
        car1.drive();
        car1.moveLeft();
        car1.moveRight();
        car1.moveFast();
        car1.turnOnHeadlights();
        car1.playMusic();
        car1.turboMode();
        System.out.println();

        // 7. Demonstrate independent actions for car2
        System.out.println("=== CAR 2 INDEPENDENT ACTIONS ===");
        car2.startEngine();
        car2.drive();
        car2.moveSlow();
        System.out.println();

        // 8. Display updated states showing that car1 and car2 remain independent
        System.out.println("=== UPDATED STATES (INDEPENDENT OBJECTS) ===");
        car1.displayState();
        car2.displayState();

        // 9. Stop engine and verify state reset (speed and gear set to 0)
        System.out.println("=== STOPPING ENGINE ===");
        car1.stopEngine();
        System.out.println();
        car1.displayState();
    }
}
    



