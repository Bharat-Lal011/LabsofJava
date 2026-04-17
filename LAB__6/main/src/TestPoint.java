import java.util.Scanner;

class Point3D {
    int x, y, z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display() {
        System.out.println("(" + x + "," + y + "," + z + ")");
    }

    double distance(Point3D p) {
        return Math.sqrt(
                (x - p.x) * (x - p.x) +
                        (y - p.y) * (y - p.y) +
                        (z - p.z) * (z - p.z)
        );
    }
}

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first point:");
        Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Enter second point:");
        Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("Point 1: ");
        p1.display();

        System.out.print("Point 2: ");
        p2.display();

        System.out.println("Distance: " + p1.distance(p2));
    }
}