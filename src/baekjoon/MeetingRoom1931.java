package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MeetingRoom1931 {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int meetingCount = Integer.parseInt(reader.readLine());
        int[][] meetings = new int[meetingCount][2];

        for (int i = 0; i <meetingCount; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            meetings[i][0] = Integer.parseInt(tokenizer.nextToken());
            meetings[i][1] = Integer.parseInt(tokenizer.nextToken());
        }
        // Arrays.sort 배열을 정렬, 회의 정보 정렬(종료시간 기준)
        // Arrays.sort(meetings, Comparator.comparingInt(o -> o[1])); -> X
        Arrays.sort (
                meetings,
                (o1, o2) ->
                {
                    // o1, o2는 {시작시간, 종료시간}, 종료 시간 다르면 종료시간 기준 비교
                    if (o1[1] != o2[1])
                        return o1[1] - o2[1];
                    return o1[0] - o2[0]; // 아니라면 시작시간 기준 비교
                }
        );

        int answer = 0; // 답안 저장
        int lastEnd = 0; // 마지막 종료시간 저장
        for (int i = 0; i < meetingCount; i++) {
            // 이번 미팅이 선택 가능한지 판단, i번째 미팅의 ()와 현재 ()를 비교
            if (meetings[i][0] >= lastEnd) {
                answer++;
                lastEnd = meetings[i][1];
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new MeetingRoom1931().solution());

    }
}
