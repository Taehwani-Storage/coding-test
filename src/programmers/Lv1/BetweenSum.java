package programmers.Lv1;

public class BetweenSum {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++)
                answer += i;
        } else {
            for (int i = b; i <= a; i++)
                answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        BetweenSum bs = new BetweenSum();
        int a = 3;
        int b = 5;

        System.out.println(bs.solution(a, b));
    }
}
