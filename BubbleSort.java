import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    public static void main(String[] args) {
        int totalElements = 1000;
        Random rand = new Random();
        int[] arr = new int[totalElements];
        for (int i = 0; i < totalElements; i++)
            arr[i] = rand.nextInt(10000);

        long start = System.nanoTime();
        bubbleSort(arr);
        long end = System.nanoTime();

        System.out.println("********** Bubble Sort Completed! *********");
        System.out.println("Total Elements:" + totalElements);
        System.out.println("Execution time in NanoSeconds:" + (end - start));
        System.out.println("Execution time in MilliSeconds:" + (end - start) / 1_000_000.0);
        System.out.println("******** Sorted Array *******");
        for (int x : arr)
            System.out.print(x + " ");
    }
}