package prog;

import java.util.Scanner;

public class changeStr {
    public static int solution(String myString, String pat) {
        // 'A'와 'B'를 서로 바꾼 문자열 생성
        String swap = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');

        // 바꾼 문자열에 pat이 포함되는지 확인
        if (swap.contains(pat)) {
            return 1; // pat이 포함되면 1 반환
        }
        return 0; // 포함되지 않으면 0 반환
    }


    public static void main(String[] args) {
//        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String myString = sc.next();
        String pat = sc.next();
        int ans = 0;

        ans = solution(myString, pat);

        System.out.println(ans);
    }
}
