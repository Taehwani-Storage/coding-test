package week5.d1;
import java.util.Arrays;

public class BubbleSort02 {

    public int[] sortARound(int[] arr, int finalRound) {
        for(int i = 0; i < finalRound; i++) {
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for(int j = 1; j <= arr.length; j++) {
            arr = sortARound(arr, arr.length - j);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11, 1};
        BubbleSort02 bs02 = new BubbleSort02();

        for(int i = 1; i < arr.length; i++) {
            arr = bs02.sort(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}