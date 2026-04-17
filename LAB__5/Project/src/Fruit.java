import java.util.Scanner;
class Fruit {
    String name;
    String type;
    double price;

    Fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    void displayFruit() {
        System.out.println(name + " | " + type + " | " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Fruit name: ");
        String name = sc.nextLine();

        System.out.println("Enter Fruit Type: ");
        String type = sc.nextLine();

        System.out.println("Enter Fruit Price: ");
        double price = sc.nextDouble();

        Fruit f = new Fruit(name,type,price);
        f.displayFruit();
}
}