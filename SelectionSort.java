import java.util.Random;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
    }

    public static void main(String[] args) {
        int totalElements = 1000;
        Random rand = new Random();
        int[] arr = new int[totalElements];
        for (int i = 0; i < totalElements; i++)
            arr[i] = rand.nextInt(10000);
        long start = System.nanoTime();
        selectionSort(arr);
        long end = System.nanoTime();
        System.out.println("********** Selection Sort Completed! *********");
        System.out.println("Total Elements:" + totalElements);
        System.out.println("Execution time in NanoSeconds:" + (end - start));
        System.out.println("Execution time in MilliSeconds:" + (end - start) / 1_000_000.0);
        System.out.println("******** Sorted Array *******");
        for (int x : arr)
            System.out.print(x + " ");
    }
}