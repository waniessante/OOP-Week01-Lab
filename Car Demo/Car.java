/*
-----------------------------------------
Department of Computer Science
University of Karachi

Course : Object Oriented Programming
Lab : Week 1 Laboratory

Student Name : Wania Batool 
Seat No : B25110006171
Section : _A_

File Name : Car.java
Purpose : Defines the Car class and its behaviours.
-----------------------------------------
*/

public class Car {


// Attributes
private String brand;
private String color;
private int speed;
private boolean engineOn;

private int fuelLevel;
private int gear;
private boolean headlightsOn;
private boolean musicPlaying;

// Constructor
public Car() {

    brand = "Unknown";
    color = "White";
    speed = 0;
    engineOn = false;

    fuelLevel = 100;
    gear = 0;
    headlightsOn = false;
    musicPlaying = false;

}

// Sets the brand and color of the car
public void setDetails(String brand, String color) {
    this.brand = brand;
    this.color = color;
}
// Starts the engine
public void startEngine() {

    if (!engineOn) {
        engineOn = true;
        System.out.println(brand + " engine started.");
    }
    else {
        System.out.println("Engine is already ON.");
    }

}
// Stops the engine and resets speed
public void stopEngine() {

    speed = 0;
    gear = 0;
    engineOn = false;

    System.out.println(brand + " engine stopped.");

}
// Drives the car
public void drive() {

    if (engineOn) {

        speed = 30;
        gear = 1;
        fuelLevel -= 5;

        System.out.println(brand + " is driving.");

    }
    else {

        System.out.println("Start the engine first.");

    }

}
// Increases speed
public void moveFast() {

    if (engineOn) {

        speed += 40;
        gear = 3;
        fuelLevel -= 10;

        System.out.println(brand + " is moving fast.");

    }
    else {

        System.out.println("Engine is OFF.");

    }

} 
// Decreases speed
public void moveSlow() {

    if (engineOn) {

        speed = 20;
        gear = 1;

        System.out.println(brand + " is moving slowly.");

    }
    else {

        System.out.println("Engine is OFF.");

    }

}
// Turns the car left
public void moveLeft() {

    System.out.println(brand + " turned left.");

}
// Turns the car right
public void moveRight() {

    System.out.println(brand + " turned right.");

}
// Turns on the headlights 
public void turnOnHeadlights() {
    headlightsOn = true; 
    System.out.println("Headlights are On." );
}
// Plays Music
public void playMusic() {
    musicPlaying = true; 
    System.out.pirntln("Music is now Playing.");
}
// Activates turbo mode
public void turboMode() {

    if (engineOn && fuelLevel >= 20) {

        speed += 80;
        fuelLevel -= 20;

        System.out.println("Turbo Mode Activated!");

    }
    else {

        System.out.println("Turbo Mode cannot be activated.");

    }

}
// Displays all car information
public void displayState() {

    System.out.println("Brand : " + brand);
    System.out.println("Color : " + color);
    System.out.println("Speed : " + speed);
    System.out.println("Fuel Level : " + fuelLevel);
    System.out.println("Gear : " + gear);
    System.out.println("Engine On : " + engineOn);
    System.out.println("Headlights : " + headlightsOn);
    System.out.println("Music Playing : " + musicPlaying);

    System.out.println();

}
}