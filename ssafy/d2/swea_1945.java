package ssafy.d2;

import java.util.Scanner;

/*
N=2a x 3b x 5c x 7d x 11e

N이 주어질 때 a, b, c, d, e 를 출력하라.

1. 2, 3, 5, 7, 11로 나누기
2. 나누다가 나머지가 1이면 다음 번호로 넘기기
 */

public class swea_1945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tVal = sc.nextInt(); // 테스트 케이스 수
        int num;

        for (int i = 0; i < tVal; i++) {
            num = sc.nextInt(); // 각 테스트 케이스의 N 입력
            int aVal = 0, bVal = 0, cVal = 0, dVal = 0, eVal = 0;

            // 소인수 분해
            while (num != 1) {
                if (num % 2 == 0) {
                    aVal++;
                    num /= 2;
                } else if (num % 3 == 0) {
                    bVal++;
                    num /= 3;
                } else if (num % 5 == 0) {
                    cVal++;
                    num /= 5;
                } else if (num % 7 == 0) {
                    dVal++;
                    num /= 7;
                } else if (num % 11 == 0) {
                    eVal++;
                    num /= 11;
                } else {
                    // 나누어 떨어지지 않는 경우
                    break;
                }
            }

            // 결과 출력
            System.out.printf("#%d %d %d %d %d %d\n", (i + 1), aVal, bVal, cVal, dVal, eVal);
        }

        sc.close();
    }
}
