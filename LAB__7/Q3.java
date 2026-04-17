 import java.util.InputMismatchException;
 import java.util.Scanner;

class Book {
    int id;
    String title, author;
    double price;

    Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Periodical extends Book {
    String period;

    Periodical(int id, String title, String author, double price, String period) {
        super(id, title, author, price);
        this.period = period;
    }

    void modify(double newPrice, String newPeriod) {
        this.price = newPrice;
        this.period = newPeriod;
    }

    void display() {
        System.out.println("\nUpdated Details:");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Period: " + period);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Period: ");
            String period = sc.nextLine();

            Periodical p = new Periodical(id, title, author, price, period);

            System.out.print("Enter New Price: ");
            double newPrice = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter New Period: ");
            String newPeriod = sc.nextLine();

            p.modify(newPrice, newPeriod);
            p.display();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct data type.");
        }
    }
} 
    

