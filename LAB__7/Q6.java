import java.util.*;

class Course {
    int id;
    String description;
    int duration;
    double fees;

    Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    void display() {
        System.out.println("Course ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration);
        System.out.println("Fees: " + fees);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course[] c = new Course[5];

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("\nEnter details for Course " + (i + 1));

                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Description: ");
                String desc = sc.nextLine();

                System.out.print("Duration: ");
                int duration = sc.nextInt();

                System.out.print("Fees: ");
                double fees = sc.nextDouble();

                c[i] = new Course(id, desc, duration, fees);
            }

            System.out.println("All Courses:");
            for (Course course : c) {
                course.display();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct values.");
        }
    }
}