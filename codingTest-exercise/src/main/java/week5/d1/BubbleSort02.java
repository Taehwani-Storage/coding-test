package week5.d1;

import java.util.Arrays;

public class BubbleSort02 {
    public int[] sortARound(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11, 1};
        BubbleSort02 bs02 = new BubbleSort02();

        for(int j = 1; j < arr.length; j++) {
            arr = bs02.sortARound(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}
