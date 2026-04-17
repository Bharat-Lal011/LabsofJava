import java.util.Scanner;

class Bank {

    double deposit(double amount, double balance) {
        return balance + amount;
    }

    double withdraw(double amount, double balance) {
        if (balance >= amount) {
            return balance - amount;
        } else {
            System.out.println("Insufficient Balance!");
            return balance;
        }
    }
}

public class BankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        // User input for initial balance
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Deposit input
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        balance = b.deposit(depositAmount, balance);
        System.out.println("After Deposit: " + balance);

        // Withdraw input
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        balance = b.withdraw(withdrawAmount, balance);
        System.out.println("After Withdraw: " + balance);

        sc.close();
    }
}