import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    Stack() {
        top = null;
    }

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;

        System.out.println(value + " pushed into stack.");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Top value is: " + top.data);
        }
    }

    void isEmpty() {
        if (top == null) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Stack is Not Empty.");
        }
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Stack values:");

            Node current = top;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}

public class StackLinkedList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();

        int choice;

        do {
            System.out.println("\n===== STACK USING LINKED LIST =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    int value = input.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.isEmpty();
                    break;

                case 5:
                    stack.display();
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
