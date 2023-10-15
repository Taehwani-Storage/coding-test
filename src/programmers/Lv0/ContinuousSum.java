package programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// #. 연속된 수의 합
public class ContinuousSum {
	/* 
	<문제설명>
	1. 연속된 임의의 수 num개를 더한 값이 total이 될때
	2. 정수배열을 오름차순으로 return
	*/
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        // 주어진 개수가 짝수일 경우와 홀수일 경우
        // 인덱스 값은 개수에서 중간을 뺀값의 +1
        int midNum = num % 2 == 0 ? total / num + 1 : total / num; // 기준점
        int lastNum = num / 2; // 연속된 수를 생성

        for(int i = 0; i < num; i++)
            answer[i] = midNum - (lastNum - i);
        return answer;
    }

    public static void main(String[] args) {
        ContinuousSum cs = new ContinuousSum();
        int num = 5;
        int total = 5;

        int[] result = cs.solution(num, total);
        System.out.println(Arrays.toString(result));
    }
}