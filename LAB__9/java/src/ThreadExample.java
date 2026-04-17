// Step 1: Create a class that extends Thread
class MyThread extends Thread {

    // Override the run() method
    public void run() {
        // Code that will run in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500); // pause for 500 milliseconds
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

// Step 2: Main class
public class ThreadExample {
    public static void main(String[] args) {

        // Create object of thread class
        MyThread t1 = new MyThread();

        // Start the thread
        t1.start();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}