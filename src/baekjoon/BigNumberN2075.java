package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BigNumberN2075 {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        // 우선순위 큐 만들기 (최솟값이 먼저 나오는 우선순위 큐)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            // 지속적인 숫자 입력
            StringTokenizer nuberToken = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                priorityQueue.offer(Integer.parseInt(nuberToken.nextToken()));
                // 일정하게 큐의 크기 유지
                if (priorityQueue.size() > n)
                    // n개 숫자 남기고 작은 숫자를 우선순위 큐에서 뺴고 있으므로
                    // 최종적으로 남는 숫자는 N개는 큰 숫자 N개
                    priorityQueue.poll();
            }
        }
        // 특히 Top에 있는 마지막 원소는 N번째로 큰 숫자
        return priorityQueue.peek();

    }

    public static void main(String[] args) throws IOException {
        System.out.println(new BigNumberN2075().solution());
    }
}
