import java.util.Scanner;
import mypack.MyCalc;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        MyCalc obj = new MyCalc();

        System.out.println("Sum = " + obj.sum(a, b));
        System.out.println("Product = " + obj.product(a, b));
        System.out.println("Difference = " + obj.difference(a, b));
        System.out.println("Quotient = " + obj.quotient(a, b));
    }
}
