package programmers.Lv0;

import java.util.Arrays;

public class FindBigNum {
    public int[] solution(int[] array) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) { // 가장 큰 값 찾기
                max = array[i]; // 큰 값이 나오면 저장
                index = i; // 큰 값에 해당하는 인덱스 저장
            }
        }
        return new int[] {max, index};
    }

    public static void main(String[] args) {
        FindBigNum fbn = new FindBigNum();
        int[] array = {9, 10 ,11, 8};

        System.out.println(Arrays.toString(fbn.solution(array)));
    }
}
