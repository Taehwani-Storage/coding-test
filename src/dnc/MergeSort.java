package dnc;

import java.util.Arrays;

public class MergeSort {
    public void sort(int[] arr) {
        // 비었거나 길이가 1이하라면 정렬할 필요 없음
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }
    // arr: 실제 정렬 배열, left: 왼쪽 배열 시작 index, right: 오른쪽 배열 끝 index
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) { // left == right 면 나누고 병합할 필요 X
            int mid = left + (right - left) / 2; // 가운데 인덱스 찾기
            // mid를 기준으로 반반 나눠서 재귀호출
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            // 각 재귀호출이 끝나면 병합
            merge(arr, left, mid, right);
        }
    }
    // 분해된 배열ㅇ르 병합하는 메소드
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // 왼쪽 배열과 오른쪽 배열의 크기
        int n2 = right - mid;
        // 배열 복사
        int[] leftArr = Arrays.copyOfRange(arr, left, left + n1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, mid + 1 + n2);
        // 임시 배열 두개를 앞쪽 원소부터 각각 비교하면서, 더 작은 원소를 원본 배열에 순서대로 저장
        int i = 0; // 왼쪽 배열 index
        int j = 0; // 오른쪽 배열 index
        int k = left; // arr index
        while (i < n1 && j < n2) {// 왼쪽과 오른쪽 모두 아직 원소가 남은 동안 반복할 while
            if (leftArr[i] <= rightArr[j]) { // 왼쪽 배열의 값이 더 작거나 같을 때
                arr[k] = leftArr[i];
                i++;
            } else { // 왼쪽 대신 오른쪽 일때
                arr[k] = rightArr[j];
                j++;
            }
            // 원본 배열의 다음 저장 위치
            k++;
        }
        // 왼쪽 배열에 원소가 남았으면 마저 저장
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        // 오른쪽 배열에 원소가 남았으면 마저 저장
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 9, 3, 1, 7, 4, 8, 6, 2, 5};
        new MergeSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

