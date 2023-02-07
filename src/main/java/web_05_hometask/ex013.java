/*
Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */
package web_05_hometask;

public class ex013 {

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        sort(arr);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    private static void swapEls(int[] arr, int i, int j) {
        int temp = arr[i - 1];
        arr[i - 1] = arr[j -1];
        arr[j - 1] = temp;
    }

    private static boolean isLess(int[] arr, int i, int j) {
        return arr[i - 1] - arr[j - 1] < 0;
    }

    private static void arrToBeSink(int[] arr, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;

            if (j < n && isLess(arr, j, j + 1))
                j++;

            if (!isLess(arr, k, j))
                break;

            swapEls(arr, k, j);

            k = j;
        }
    }

    private static void sortDown(int[] arr, int n) {
        while (n > 1) {
            swapEls(arr, 1, n--);
            arrToBeSink(arr, 1, n);
        }
    }

    private static void buildMaxHeap(int[] arr, int n) {
        for (int k = n / 2; k >= 1; k--)
            arrToBeSink(arr, k, n);
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        buildMaxHeap(arr, n);
        sortDown(arr, n);
    }
}
