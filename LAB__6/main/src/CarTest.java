import java.util.Scanner;

abstract class Car {
    int speed;

    // constructor to set speed
    Car(int speed) {
        this.speed = speed;
    }

    void display() {
        System.out.println("Car speed: " + speed);
    }

    abstract int avg();
    abstract void mode();
}

class Maruti extends Car {
    int mileage;

    Maruti(int speed, int mileage) {
        super(speed);
        this.mileage = mileage;
    }

    int avg() {
        return mileage;
    }

    void mode() {
        System.out.println("Maruti Mode");
    }
}

class Santro extends Car {
    int mileage;

    Santro(int speed, int mileage) {
        super(speed);
        this.mileage = mileage;
    }

    int avg() {
        return mileage;
    }

    void mode() {
        System.out.println("Santro Mode");
    }
}

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c;

        // User choice
        System.out.println("Choose Car:");
        System.out.println("1. Maruti");
        System.out.println("2. Santro");
        int choice = sc.nextInt();

        // Common inputs
        System.out.print("Enter speed: ");
        int speed = sc.nextInt();

        System.out.print("Enter average (mileage): ");
        int avg = sc.nextInt();

        if (choice == 1) {
            c = new Maruti(speed, avg);
        } else if (choice == 2) {
            c = new Santro(speed, avg);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        // Output
        c.display();
        System.out.println("Avg: " + c.avg());
        c.mode();

        sc.close();
    }
}