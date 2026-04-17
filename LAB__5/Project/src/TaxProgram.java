import java.util.Scanner;

class TaxProgram {

    static double calculateTax(double grossPay, double taxRate) {
        return grossPay * taxRate;
    }

    static double calculateNetPay(int hours, double rate, double taxRate) {
        double gross = hours * rate;
        double tax = calculateTax(gross, taxRate);
        return gross - tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User inputs
        System.out.print("Enter number of hours worked: ");
        int hours = sc.nextInt();

        System.out.print("Enter hourly rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter tax rate (e.g. 0.15 for 15%): ");
        double taxRate = sc.nextDouble();

        // Calculate net pay
        double netPay = calculateNetPay(hours, rate, taxRate);

        System.out.println("Net Pay:" + netPay);

        sc.close();
    }
}