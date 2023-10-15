package programmers.Lv1;

public class ChangeOne {
    public int solution(int n) {
        int answer = 0;

        for (int x = 1; x <= n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ChangeOne co = new ChangeOne();
        int n = 12;

        System.out.println(co.solution(n));
    }
}
