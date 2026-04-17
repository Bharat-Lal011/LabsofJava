import java.util.Scanner;

class Student {
    String name;

    void inputName(String n) {
        name = n;
    }

    void average(int m1, int m2, int m3) {
        double avg = (m1 + m2 + m3) / 3.0;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Average Marks: " + avg);

        if (avg > 50)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Student name: ");
        String name = sc.nextLine();
        s.inputName(name);

        System.out.print("Enter marks of 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        s.average(m1, m2, m3);
    }
}