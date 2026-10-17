import java.util.Random;

public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2)
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int totalElements = 1000;
        Random rand = new Random();
        int[] arr = new int[totalElements];
        for (int i = 0; i < totalElements; i++)
            arr[i] = rand.nextInt(10000);
        long start = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();
        System.out.println("********** Merge Sort Completed! *********");
        System.out.println("Total Elements:" + totalElements);
        System.out.println("Execution time in NanoSeconds:" + (end - start));
        System.out.println("Execution time in MilliSeconds:" + (end - start) / 1_000_000.0);
        System.out.println("******** Sorted Array *******");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
