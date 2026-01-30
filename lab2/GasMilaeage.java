import java.util.Scanner;

class GasMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double miles, gallons;
        double totalMiles = 0;
        double totalGallons = 0;

        System.out.println("Enter trip details (-1 to stop)");

        while (true) {
            System.out.print("Enter miles driven: ");
            miles = sc.nextDouble();

            if (miles == -1)
                break;

            System.out.print("Enter gallons used: ");
            gallons = sc.nextDouble();

            double mpg = miles / gallons;
            System.out.println("Miles per gallon for this trip: " + mpg);

            totalMiles += miles;
            totalGallons += gallons;

            double totalMPG = totalMiles / totalGallons;
            System.out.println("Combined MPG till now: " + totalMPG);
            System.out.println();
        }

        sc.close();
    }
}
