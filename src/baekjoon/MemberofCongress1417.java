package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MemberofCongress1417 {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // 입력
        int candidate = Integer.parseInt(reader.readLine());
        // 첫줄이 내 득표수
        int myVote = Integer.parseInt(reader.readLine());
        // 제일 많은 득표자의 표를 먼저 뺏어야 하니까 (Max 우선순위)
        PriorityQueue<Integer> otherVote
                = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < candidate - 1; i++) { // 다솜이 빼고 나머지 표
            otherVote.offer(Integer.parseInt(reader.readLine()));
        }

        int answer = 0;
        // 단일 후보가 아닌 경우에, 계산 진행
        if (!otherVote.isEmpty()) {
            // 나머지 후보들 득표중 최닷값이 나보다 작아질 때까지
            while (otherVote.peek() >= myVote) {
                int votes = otherVote.poll(); // 최다 득표자의 득표수
                otherVote.offer(votes - 1); // 그 사람의 지지자를 한명 매수
                myVote++; // 뺏은 표는 내 것으로
                answer++; // 매수 진행 횟수
            }
        }

        //출력
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MemberofCongress1417 moc1417 = new MemberofCongress1417();
        System.out.println(moc1417.solution());

    }
}
