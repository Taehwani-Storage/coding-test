package programmers.Lv0;

import java.util.Arrays;

public class CutArray {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        int index = 0;
        for (int i = num1; i <= num2; i++)
            answer[index++] = numbers[i];

        return answer;
    }

    public static void main(String[] args) {
        CutArray cutArray = new CutArray();
        int[] nums = {1, 2, 3, 4, 5};
        int num1, num2;
        num1 = 1;
        num2 = 3;

        System.out.println(Arrays.toString(cutArray.solution(nums, num1, num2)));
    }
}
