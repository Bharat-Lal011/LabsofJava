
//  program to find Sum Average Product Largest Smallest from given numbers.

import java.util.Scanner;

interface Calc {
    void calculate(int a, int b, int c);
}

class Numbers implements Calc {
    public void calculate(int a, int b, int c) {
        int sum = a + b + c;
        int product = a * b * c;

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / 3));
        System.out.println("Product = " + product);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}

class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Numbers n = new Numbers();
        n.calculate(a, b, c);
    }
}
