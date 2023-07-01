package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 5, 4 };
        System.out.println("Input array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxElement(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
