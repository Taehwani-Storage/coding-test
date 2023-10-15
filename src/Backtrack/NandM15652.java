package Backtrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 중복순열 문제
public class NandM15652 {
    private int n;
    private int m;
    private int[] arr; // 중복순열을 담는 배열
    private StringBuilder answer; // 정답 저장할 StringBuilder

    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(infoToken.nextToken());
        m = Integer.parseInt(infoToken.nextToken());

        arr = new int[m]; // 순열 저장 배열

        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        NandM15651 nm15651 = new NandM15651();
        nm15651.solution();
    }
}