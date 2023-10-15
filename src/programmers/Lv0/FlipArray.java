package programmers.Lv0;

import java.util.Arrays;

public class FlipArray {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        int index = 0;
        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = num_list[index++];
        }
        return answer;
    }

    public static void main(String[] args) {
        FlipArray flipArray = new FlipArray();
        int[] list = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(flipArray.solution(list)));
    }
}
