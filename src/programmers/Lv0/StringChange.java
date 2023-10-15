package programmers.Lv0;

import java.util.Scanner;

public class StringChange {
    public String solution(int n) {
        String answer = "";
//        return String.valueOf(n);
//        return Integer.toString(n);
        return String.format("%d", n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringChange sc = new StringChange();
        int n = scan.nextInt();

        String s = sc.solution(n);
        System.out.println(s);
    }
}
