abstract class Base {
    abstract void debug();
}

class Module1 extends Base {
    void debug() {
        System.out.println("Debugging Module 1");
    }
}

class Module2 extends Base {
    void debug() {
        System.out.println("Debugging Module 2");
    }
}

public class Q5 {
    public static void main(String[] args) {
        try {
            Base b1 = new Module1();
            Base b2 = new Module2();

            b1.debug();
            b2.debug();

        } catch (Exception e) {
            System.out.println("Error occurred!");
        }
    }
}
