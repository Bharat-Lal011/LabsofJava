import java.util.InputMismatchException;
import java.util.Scanner;

// Base class
class Vehicle {
    String name;
    double speed;

    Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    void maxSpeed() {
        System.out.println(name + " max speed: " + speed + " km/h");
    }
}

// Subclass Car
class Car extends Vehicle {
    Car(String name, double speed) {
        super(name, speed); // using super
    }

    void maxSpeed() {
        System.out.println("Car (" + name + ") max speed: " + speed + " km/h");
    }
}

// Subclass Bicycle
class Bicycle extends Vehicle {
    Bicycle(String name, double speed) {
        super(name, speed);
    }

    void maxSpeed() {
        System.out.println("Bicycle (" + name + ") max speed: " + speed + " km/h");
    }
}

// Subclass Scooter
class Scooter extends Vehicle {
    Scooter(String name, double speed) {
        super(name, speed);
    }

    void maxSpeed() {
        System.out.println("Scooter (" + name + ") max speed: " + speed + " km/h");
    }
}

// Main class
public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter vehicle name: ");
            String name = sc.nextLine();

            System.out.print("Enter max speed: ");
            double speed = sc.nextDouble();

            // Exception for negative speed
            if (speed < 0) {
                throw new IllegalArgumentException("Speed cannot be negative!");
            }

            // Creating objects
            Car car = new Car(name, speed);
            Bicycle bicycle = new Bicycle(name, speed);
            Scooter scooter = new Scooter(name, speed);

            // Calling methods
            car.maxSpeed();
            bicycle.maxSpeed();
            scooter.maxSpeed();
        }

        // Handling wrong input type
        catch (InputMismatchException e) {
            System.out.println(" Invalid input! Please enter numeric value for speed.");
        }

        // Handling negative values
        catch (IllegalArgumentException e) {
            System.out.println(" Error: " + e.getMessage());
        }

        // General exception
        catch (Exception e) {
            System.out.println(" Unexpected error occurred.");
        }

        // Always executed
        finally {
            sc.close();
            System.out.println("Program Ended.");
        }
    }
}