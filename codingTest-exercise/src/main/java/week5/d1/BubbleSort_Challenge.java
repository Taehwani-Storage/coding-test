package week5.d1;

import java.util.Comparator;

public class BubbleSort_Challenge {

    public static <T> void bubbleSort(T[] arr, Comparator<? super T> c) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (c.compare(arr[j], arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 1, 4, 2, 8};

        bubbleSort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        // Output: 1 2 4 5 8
    }
}