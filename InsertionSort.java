import java.util.Random;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int totalElements = 1000;
        Random rand = new Random();
        int[] arr = new int[totalElements];
        for (int i = 0; i < totalElements; i++)
            arr[i] = rand.nextInt(10000);
        long start = System.nanoTime();
        insertionSort(arr);
        long end = System.nanoTime();
        System.out.println("********** Insertion Sort Completed! *********");
        System.out.println("Total Elements:" + totalElements);
        System.out.println("Execution time in NanoSeconds:" + (end - start));
        System.out.println("Execution time in MilliSeconds:" + (end - start) / 1_000_000.0);
        System.out.println("******** Sorted Array *******");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
