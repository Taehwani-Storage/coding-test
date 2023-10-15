package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baseball2503 {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tries = Integer.parseInt(reader.readLine());
        int[][] ballInfo = new int[tries][3];
        for (int i = 0; i < tries; i++) {
            StringTokenizer countTokens = new StringTokenizer(reader.readLine());
            ballInfo[i] = new int[]{
                    Integer.parseInt(countTokens.nextToken()),
                    Integer.parseInt(countTokens.nextToken()),
                    Integer.parseInt(countTokens.nextToken())
            };
        }
        int answer = 0;
        // 자연수 3개 나열
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                // 겹치지 않게 숫자를 골라야 하므로
                if (j == i) continue;
                for (int k = 1; k < 10; k++) {
                    if (k == i || k == j) continue;
                    // 답변 후보 배열
                    int[] answerCandidate = new int[]{i, j, k};
                    boolean isAnswer = true;
                    for (int t = 0; t < tries; t++) { // 질문들 순회
                        int select = ballInfo[t][0];
                        // 답변 후보와 비교
                        int[] result = getCount(select, answerCandidate);
                        // 실제 볼 카운트와 동인한지
                        if (result[0] != ballInfo[t][1] || result[1] != ballInfo[t][2]) {
                            isAnswer = false; // 답이 될 수 없음
                            break; // 나머지 조건 확인 불필요
                        }
                    }
                    if (isAnswer) answer++;
                }
            }
        }
        return answer;
    }
    // 두 숫자의 볼 카운트를 반환하는 메소드
    public int[] getCount(int select, int[] answer) {
        int strikes = 0;
        int balls = 0;

        int[] selectNums = new int[] {select / 100, (select / 10) % 10, select % 10};

        for (int i = 0; i < 3; i++) {
            // 스트라이트 라면
            if (selectNums[i] == answer[i]) strikes++;
            // 스트라이크 아니면
            else {
                for (int j = 0; j < 3; j++) {
                    if (selectNums[i] == answer[j]) balls++;
                }
            }
        }
        return new int[]{strikes, balls};
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Baseball2503().solution());
    }
}
