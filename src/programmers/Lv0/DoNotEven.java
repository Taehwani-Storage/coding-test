package programmers.Lv0;

import java.util.Arrays;

public class DoNotEven {
    public int[] solution(int n) {
        int[] answer;

        if (n % 2 == 0)
            answer = new int[n / 2];
        else
            answer = new int[n / 2 + 1];

        int index = 0;
        for (int i = 1; i <= n; i++) {
            answer[index] = i + 1;
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        DoNotEven dne = new DoNotEven();
        int n = 15;

        System.out.println(Arrays.toString(dne.solution(n)));
    }

}
