package programmers.Lv0;

public class DividePizza2 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 10;
        DividePizza2 dp2 = new DividePizza2();

        System.out.println(dp2.solution(n));
    }
}
