package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 25, 12, 18, 24, 2, 21 };
        int n = arr.length;

//        가장 작은 원소 찾아 앞으로
        for( int i = 0; i < n - 1; i++) { // i의 값이 총 정렬된 원소 갯수
//            배열 맨 앞에 원소가 가장 작다고 가정
            int minIndex = i;
//            i + 1부터 끝 원소까지 하나씩 비교
            for (int j = i + 1; j < n; j++) {
//                가장 작은 숫자 찾기
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
//            배열 맨 앞 원소와 가장 작은 원소 교환
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
