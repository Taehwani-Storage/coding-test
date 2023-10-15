package heap;

import java.util.Arrays;

public class HeapSort {
    public void sort(int[] arr) {
        // 배열의 크기를 조사
        int size = arr.length;
        // 전체 배열을 힙의 형태로
        for (int i = size / 2 - 1; i >= 0; i--) {
//            heapify(arr, size, i);
        }
        // 정렬 안된 마지막 노드랑 루트 노드를 교환해가며
        // 남은 원소들을 힙의 형태로 유지
        for (int i = size - 1; i > 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

//            heap
        }

    }

    public static void main(String[] args) {
        int[] array = {9, 4, 7, 1, 2, 6, 3};
        new HeapSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}
