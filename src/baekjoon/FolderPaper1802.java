package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FolderPaper1802 {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine());
        for (int i = 0; i < tests; i++) {
            if (foldable(reader.readLine()))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    // 종이의 굴곡이 0과 1로 문자열이 주어짐
    // 1000110
    private boolean foldable(String paper) {
        if (paper.length() > 1) { // 굴곡 하나면 확인 X (반 접은 상태)
            int half = paper.length() / 2; // 절반 지점
            // 왼쪽 종이와 오른 쪽 종이가 조건을 만족하는지 검사
            if (!foldable(paper.substring(0, half))) return false;
            if (!foldable(paper.substring(half + 1))) return false;
            // 작은 부분들이 만족스러웠으면, 현재 크기에서 서로 좌우 역대칭이 되는지 확인
            for (int i = 1; i < half + 1; i++) {
                // 중간 지점에서 i만큼 + 또는 - 한 위치의 굴곡 확인
                // 굴곡 모양이 일치하는 경우 조건 만족 X
                if (paper.charAt(half + i) == paper.charAt(half - i))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        new FolderPaper1802().solution();
    }
}
/*
2
5
3 1 5 4 2
4
1 3 2 4
 */