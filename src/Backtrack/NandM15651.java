package Backtrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 중복순열 문제
public class NandM15651 {
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
        answer = new StringBuilder(); // 정잡 저장 StringBuilder
        dfs(0);

        System.out.println(answer);
    }
    // 몇번쨰 숫자를 고르고 있나
    // 0 ~ level ~ m - 1
    private void dfs(int level) {
        if (level == m) {
            // 정답 저장
            for (int i = 0; i < m; i++) {
                answer.append(arr[i]).append(' ');
            }
            answer.append('\n');
        }
        else // 아직 남음, 1 ~ n 반복
            for (int i = 1; i < n + 1; i++) {
                arr[level] = i; // 이번 숫자로 i 선택
                dfs(level + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        NandM15651 nm15651 = new NandM15651();
        nm15651.solution();
    }
}
