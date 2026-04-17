import java.util.InputMismatchException;
import java.util.Scanner;

class FinalBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the initial balance: ");
            double initialBalance = scanner.nextDouble();

            if (initialBalance < 0) {
                throw new IllegalArgumentException("Balance cannot be negative.");
            }

            System.out.print("Enter the annual interest rate (in percentage): ");
            double annualInterestRate = scanner.nextDouble();

            if (annualInterestRate < 0) {
                throw new IllegalArgumentException("Interest rate cannot be negative.");
            }

            System.out.print("Enter the number of months: ");
            int months = scanner.nextInt();

            if (months < 0) {
                throw new IllegalArgumentException("Months cannot be negative.");
            }

            double finalBalance = calculateFinalBalance(initialBalance, annualInterestRate, months);
            System.out.printf("The final balance after %d months is: %.2f%n", months, finalBalance);

        } 
        catch (InputMismatchException ex) {
            System.out.println(" Invalid input! Please enter numeric values only.");
        } 
        catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        } 
        catch (Exception ex) {
            System.out.println(" Unexpected error occurred.");
        } 
        finally {
            scanner.close();
            System.out.println("Program ended.");
        }
    }

    public static double calculateFinalBalance(double initialBalance, double annualInterestRate, int months) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double finalBalance = (months * monthlyInterestRate * initialBalance) + initialBalance;
        return finalBalance;
    }
}