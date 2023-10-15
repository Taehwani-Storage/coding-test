package programmers.Lv1;

import java.util.Arrays;

public class MaxMin {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" "); // " " 기준으로 str배열에 담기
        int[] arr = new int[str.length];
        // 문자를 숫자로 변형
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr); // 배열 정렬(오름차순)
        int min = arr[0]; // 최솟값(배열 첫번째)
        int max = arr[str.length - 1]; // 최댓값(배열 마지막)
        answer = min + " " + max;

        return answer;

    }

    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        String str = "-1 -2 -3 -4";
        System.out.println(maxMin.solution(str));
    }
}
