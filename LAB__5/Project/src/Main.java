import java.util.*;

interface QueueImpl {
    void insert(int x);
    void delete();
    void display();
}

class QueueDemo implements QueueImpl {
    int queue[] = new int[10];
    int front = -1, rear = -1;

    public void insert(int x) {
        if (rear == 9) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = x;
    }

    public void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Deleted: " + queue[front++]);
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.display();
        q.delete();
        q.display();
    }
}