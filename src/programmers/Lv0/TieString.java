package programmers.Lv0;

import java.util.Arrays;

public class TieString {
    public int solution(String[] strArr) {
        int[] answer = new int[100000];
        // 문자열 배열 안에 있는 문자들의 길이 읽기
        for (int i = 0; i < strArr.length; i++) {
            answer[strArr[i].length()]++;
        }
        // stream 사용해서 길이의 최댓값 반환
        return Arrays.stream(answer).max().getAsInt();
    }

    public static void main(String[] args) {
        TieString ts = new TieString();
        String[] strArr = {"ab", "bc", "bd", "efg", "hi"};

        System.out.println(ts.solution(strArr));

    }
}
