import java.util.*;

class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}

class Student extends Teacher {
    int rollNo;
    String course;

    Student(String name, String subject, int rollNo, String course) {
        super(name, subject);
        this.rollNo = rollNo;
        this.course = course;
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            Student s = new Student(name, subject, roll, course);
            s.display();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}