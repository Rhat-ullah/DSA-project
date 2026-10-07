import java.util.Scanner;

public class CircularQueue {

    static int[] queue = new int[5];

    static int front = -1;
    static int rear = -1;

    static void enqueue(int value) {

        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue is Full.");
        } else {

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % queue.length;
            queue[rear] = value;

            System.out.println(value + " added to queue.");
        }
    }

    static void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty.");
        } else {

            System.out.println(queue[front] + " removed from queue.");

            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % queue.length;
            }
        }
    }

    static void peek() {

        if (front == -1) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Front value is: " + queue[front]);
        }
    }

    static void isEmpty() {

        if (front == -1) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Queue is Not Empty.");
        }
    }

    static void display() {

        if (front == -1) {
            System.out.println("Queue is Empty.");
        } else {

            System.out.println("Queue values:");

            int i = front;

            while (true) {

                System.out.println(queue[i]);

                if (i == rear) {
                    break;
                }

                i = (i + 1) % queue.length;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== CIRCULAR QUEUE USING ARRAY =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = input.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    isEmpty();
                    break;

                case 5:
                    display();
                    break;

                case 6:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        input.close();
    }
}