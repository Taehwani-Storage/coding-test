package ssafy.d2;

import java.util.Scanner;

public class swea_1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받음
        int nVal = sc.nextInt();

        // N번 반복
        for (int i = 1; i <= nVal; i++) {
            String number = String.valueOf(i); // 문자열로 변환
            int clapCnt = 0; // 박수 횟수

            // 각 자리수에 3, 6, 9가 있는지 확인
            for (char n : number.toCharArray()) {
                if (n == '3' || n == '6' || n == '9') {
                    clapCnt++;
                }
            }

            // 박수 횟수만큼 "-", 박수가 없다면 숫자 출력
            if (clapCnt > 0) {
                for (int j = 0; j < clapCnt; j++) {
                    System.out.print("-");
                }
                System.out.print(" "); // 다음 출력과의 구분을 위해 공백 추가
            } else
                System.out.print(i + " ");
        }
        sc.close();
    }
}
