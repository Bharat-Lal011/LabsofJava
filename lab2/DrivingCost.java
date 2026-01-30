import java.util.Scanner;

class DrivingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double miles, costPerGallon, parkingFee, tolls;
        double mpg = 25; // assume car gives 25 miles per gallon

        System.out.print("Enter total miles driven per day: ");
        miles = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        costPerGallon = sc.nextDouble();

        System.out.print("Enter average parking fees per day: ");
        parkingFee = sc.nextDouble();

        System.out.print("Enter tolls per day: ");
        tolls = sc.nextDouble();

        double fuelCost = (miles / mpg) * costPerGallon;
        double totalCost = fuelCost + parkingFee + tolls;

        System.out.println("Your daily driving cost = " + totalCost);

        sc.close();
    }
}
