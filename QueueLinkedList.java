import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;

    Queue() {
        front = null;
        rear = null;
    }

    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " added to queue.");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println(front.data + " removed from queue.");

            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    void peek() {
        if (front == null) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Front value is: " + front.data);
        }
    }

    void isEmpty() {
        if (front == null) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Queue is Not Empty.");
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Queue values:");

            Node current = front;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();

        int choice;

        do {
            System.out.println("\n===== QUEUE USING LINKED LIST =====");
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
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.isEmpty();
                    break;

                case 5:
                    queue.display();
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
