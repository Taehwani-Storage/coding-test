package sort;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort (int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // 반복 횟수 나타내는 몇 번째 단계인지
            for (int j = 0; j < n - 1; j++) {
                // 왼쪽 원소 > 오른쪽 원소일 때, 교환
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 36, 12, 18, 15, 41, 19 };
        BubbleSort bubbleSort = new BubbleSort();

//       첫번째 원소와 인접한 원소를 비교,
//       두번째 원소와 세번째 원소를 비교
//        ...
//       n - 1번째 원소와 n번째 원소를 비교
        System.out.println(Arrays.toString(bubbleSort.sort(arr)));
    }
}
