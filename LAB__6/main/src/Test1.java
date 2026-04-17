import java.util.Scanner;

class Parent {
    int x;

    Parent(int x) {
        this.x = x;
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    int x;

    Child(int parentX, int childX) {
        super(parentX); // pass value to parent
        this.x = childX;
        System.out.println("Child Constructor");
    }

    void show() {
        System.out.println("Child x: " + this.x);   // child value
        System.out.println("Parent x: " + super.x); // parent value
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter value for Parent x: ");
        int parentX = sc.nextInt();

        System.out.print("Enter value for Child x: ");
        int childX = sc.nextInt();

        // Create object with user input
        Child obj = new Child(parentX, childX);

        obj.show();

        sc.close();
    }
}