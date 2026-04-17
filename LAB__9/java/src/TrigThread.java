class SinThread extends Thread {
    double x;

    SinThread(double x) {
        this.x = x;
    }

    public void run() {
        System.out.println("sin(" + x + ") = " + Math.sin(x));
    }
}

class CosThread extends Thread {
    double x;

    CosThread(double x) {
        this.x = x;
    }

    public void run() {
        System.out.println("cos(" + x + ") = " + Math.cos(x));
    }
}

public class TrigThread {
    public static void main(String[] args) {
        double x = Math.PI / 4;

        SinThread t1 = new SinThread(x);
        CosThread t2 = new CosThread(x);

        t1.start();
        t2.start();
    }
}