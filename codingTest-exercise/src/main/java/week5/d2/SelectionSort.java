package week5.d2;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for(int j = 0; j < arr.length - 1; j++) {
            int targetVal = arr[j];
            int targetidx = j;
            for(int i = j + 1; i < arr.length; i++) {
                if(targetVal > arr[i]) {
                    targetVal = arr[i];
                    targetidx = i;
                }
            }
            int tmp = arr[j];
            arr[j] = arr[targetidx];
            arr[targetidx] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
