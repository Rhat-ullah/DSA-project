import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] array = new int[3][3];

        int choice;

        do {
            System.out.println("\n===== 2D ARRAY =====");
            System.out.println("1. Enter Values");
            System.out.println("2. Display Values");
            System.out.println("3. Search Value");
            System.out.println("4. Update Value");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter 9 values:");

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Enter value [" + i + "][" + j + "]: ");
                            array[i][j] = input.nextInt();
                        }
                    }

                    System.out.println("Values added successfully.");
                    break;

                case 2:
                    System.out.println("2D Array values:");

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(array[i][j] + " ");
                        }

                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    int search = input.nextInt();

                    boolean found = false;

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {

                            if (array[i][j] == search) {
                                System.out.println("Value found at position [" + i + "][" + j + "]");
                                found = true;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("Value not found.");
                    }

                    break;

                case 4:
                    System.out.print("Enter row (0-2): ");
                    int row = input.nextInt();

                    System.out.print("Enter column (0-2): ");
                    int column = input.nextInt();

                    if (row >= 0 && row < 3 && column >= 0 && column < 3) {

                        System.out.print("Enter new value: ");
                        int newValue = input.nextInt();

                        array[row][column] = newValue;

                        System.out.println("Value updated successfully.");

                    } else {
                        System.out.println("Invalid row or column.");
                    }

                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        input.close();
    }
}
