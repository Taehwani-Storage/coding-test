package programmers.Lv0;

import java.math.BigInteger;

public class DividNine {
    public int solution(String number) {
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - '0'; // 문자열을 한자리 정수로 바꾸는 법
        }
        answer %= 9;
        return answer;
    }

    public static void main(String[] args) {
        DividNine dn = new DividNine();
        String number = "78720646226947352489";

        System.out.println(dn.solution(number));
    }
}
