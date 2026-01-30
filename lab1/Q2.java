import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b)
            System.out.println("The numbers are equal");
        else
            System.out.println(Math.max(a, b) + " is larger");
    }
}


