import java.util.Scanner;

public class Theater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of attendees: ");
        int people = sc.nextInt();

        double income = people * 5;
        double cost = 20 + (0.5 * people);
        double profit = income - cost;

        System.out.println("Total Profit: $" + profit);
    }
}
