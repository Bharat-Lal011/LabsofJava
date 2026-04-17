import java.util.Random;

class Player extends Thread {
    int number;

    public void run() {
        Random r = new Random();
        number = r.nextInt(100); // random 0–99
        System.out.println(Thread.currentThread().getName() + " got: " + number);
    }
}

public class Game {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player();
        Player p2 = new Player();

        p1.setName("Player 1");
        p2.setName("Player 2");

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        if (p1.number > p2.number) {
            System.out.println("Player 1 wins with score: " + (p1.number - p2.number));
        } else {
            System.out.println("Player 2 wins with score: " + (p2.number - p1.number));
        }
    }
}