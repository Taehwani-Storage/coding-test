package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MooGame5904 {
    public char solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int length = 3; // 최초 수열의 길이 3
        // 목표는 반복해서 수열을 만들어 length가 n보다 커지게 만들면서
        // length가 moo 수열의 길이만한 값을 유지
        int reps = 0;
        while (length < n) {
            // 처음 만드는 수열으 S(1)이니 증가시키고 시작
            reps++;
            length = length * 2 + (reps + 3);
//            System.out.println(length);
        }
        // reps(k)와 length의 정보가 있다면, moo 수열의 구역을 3단위로 나눔
        // 좌우대칭 앞과 뒤, + reps + 3으로 이루어진 moo...o
        // 가운데 구간에 n이 위치한다면 정확하게 어떤 글자인지 판단
        // 앞쪽 또는 뒤쪽이라면, 구간을 줄여서 다시 3등분, 반복해서 가운데 위치할 때까지 진행
        n--; // 인덱스 기준으로 찾기위해 n의 값을 사전 조정
        while (true) {
            int midIdx = (length - (reps + 3)) / 2; // 가운데 인덱스 위치 찾기
            // 가운데 시작 인덱스부터 가운데 구간 길이 합
            int lastIdx = (length - (reps + 3)) / 2 + (reps + 3);
            // 만약 n == midIdx라면, 가운데 구간의 시작
            if (n == midIdx) // 구간 시작이면 m
                return 'm';
            else if (midIdx < n && n < lastIdx) // 시작은 아니지만, 가운데 구간이면 o
                return 'o';
            else if (n >= lastIdx) { // 아니라면, 길이를 줄여서 다시 품
                // 버리는 길이만큼 n과 length 조정
                n -= lastIdx;
                length -= lastIdx;
            } else {
                // 가운데 구간의 길이와 가운데 구간까지의 길이를 둘다 빼줌
                length -= (reps + 3) + midIdx;
            }
            reps--;
        }
//        return 'o';
    }

    public static void main(String[] args) throws IOException {
        MooGame5904 mg5904 = new MooGame5904();
        System.out.println(mg5904.solution());
    }
}
