class FibonacciThread extends Thread {
    public void run() {
        int a = 1, b = 1;

        System.out.println("Fibonacci Series (50 terms):");

        for (int i = 1; i <= 50; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;

            try {
                Thread.sleep(50); // small delay
            } catch (Exception e) {}
        }

        System.out.println("\nFibonacci Completed\n");
    }
}

class PrimeThread extends Thread {
    public void run() {
        int count = 0, num = 2;

        System.out.println("Prime Numbers (25 terms):");

        while (count < 25) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        System.out.println("\nPrime Calculation Completed");
    }
}

public class Numbers {
    public static void main(String[] args) {
        FibonacciThread f = new FibonacciThread();
        PrimeThread p = new PrimeThread();

        f.setPriority(8);
        p.setPriority(5);


        f.start();

        try {
            f.join();
        } catch (Exception e) {}

        p.start();
    }
}