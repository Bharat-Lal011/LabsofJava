// Step 1: Class implementing Runnable
class MyRunnable implements Runnable {

    Thread t;

    // Constructor
    MyRunnable() {
        // Create thread object and pass current class object (this)
        t = new Thread(this);

        // Start the thread
        t.start();
    }

    // Step 2: Override run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Step 3: Main class
public class RunnableExample {
    public static void main(String[] args) {

        // Thread will start automatically when object is created
        MyRunnable obj = new MyRunnable();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
