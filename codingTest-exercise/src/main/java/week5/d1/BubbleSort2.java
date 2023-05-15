package week5.d1;

import java.util.Arrays;

public class BubbleSort2 {
    public int[] sort(int[] arr, boolean isAscend) {
//        boolean isAscend
        if (isAscend == true) {
            for(int i = 0; i < arr.length -1; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] > arr[j]) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
        else {
            for(int i = 0; i < arr.length -1; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] < arr[j]) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort2 bs2 = new BubbleSort2();
        int[] arr = {7, 2, 3, 9, 28, 11, 1};

        arr = bs2.sort(arr, false);
        System.out.println(Arrays.toString(arr));
    }
}
