//print diameter circumference area

import java.util.Scanner;

class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        System.out.println("Diameter = " + (2 * r));
        System.out.println("Circumference = " + (2 * pi * r));
        System.out.println("Area = " + (pi * r * r));
    }
}
