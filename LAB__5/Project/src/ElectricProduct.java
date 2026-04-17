import java.util.Scanner;

class Product {
    int id;
    String name, category;
    double price;

    Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

class ElectricalProduct extends Product {
    int voltage, wattage;

    ElectricalProduct(int id, String name, String category, double price,
                      int voltage, int wattage) {
        super(id, name, category, price);
        this.voltage = voltage;
        this.wattage = wattage;
    }

    void update(int newWatt, double newPrice) {
        wattage = newWatt;
        price = newPrice;
    }

    void display() {
        System.out.println(id + " " + name + " " + category + " " +
                price + " " + voltage + "V " + wattage + "W");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input product details
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Voltage: ");
        int voltage = sc.nextInt();

        System.out.print("Enter Wattage: ");
        int wattage = sc.nextInt();

        // Create object
        ElectricalProduct e = new ElectricalProduct(id, name, category, price, voltage, wattage);

        // Update details
        System.out.print("Enter New Wattage: ");
        int newWatt = sc.nextInt();

        System.out.print("Enter New Price: ");
        double newPrice = sc.nextDouble();

        e.update(newWatt, newPrice);

        // Display result
        System.out.println("\nUpdated Product Details:");
        e.display();

        sc.close();
    }
}