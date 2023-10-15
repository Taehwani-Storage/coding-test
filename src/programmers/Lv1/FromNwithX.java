package programmers.Lv1;

import java.util.Arrays;

public class FromNwithX {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        int num = 1;
        for (int i = 0; i < n; i++)
            answer[i] = num++ * (long) x;
//            answer[i] *= (long) x;
//            num++;
        return answer;
    }

    public static void main(String[] args) {
        FromNwithX fnwx = new FromNwithX();
        int xVal = 11;
        int nVal = 9;

        System.out.println(Arrays.toString(fnwx.solution(xVal, nVal)));
    }
}
