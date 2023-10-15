package programmers.Lv0;

public class OrderCase {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) answer++;

        return answer;
    }

    public static void main(String[] args) {
        OrderCase oc = new OrderCase();
        int n = 100;

        System.out.println(oc.solution(n));
    }
}
