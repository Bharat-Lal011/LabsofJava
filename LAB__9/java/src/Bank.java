class Account {
    int balance = 600;

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Father deposited: " + amount + " Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println("Son withdrew: " + amount + " Balance: " + balance);
    }
}

class Father extends Thread {
    Account acc;

    Father(Account acc) {
        this.acc = acc;
    }

    public void run() {
        while (true) {
            if (acc.balance < 2000) {
                int amt = (int)(Math.random() * 200 + 1);
                acc.deposit(amt);
            }

            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class Son extends Thread {
    Account acc;

    Son(Account acc) {
        this.acc = acc;
    }

    public void run() {
        while (true) {
            if (acc.balance > 2000) {
                int amt = (int)(Math.random() * 150 + 1);
                acc.withdraw(amt);
            }

            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();

        Father f = new Father(acc);
        Son s = new Son(acc);

        f.start();
        s.start();
    }
}
