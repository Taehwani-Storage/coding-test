package programmers.Lv1;

public class FibonacciNum {
    public int solution(int n) {
        int fibo1 = 0; // 첫번째 피보나치 수
        int fibo2 = 1; // 두번째 피보나치 수
        int answer = 0;
        // 2부터 시작하는 피보나치 수 구하기
        for (int i = 2; i <= n; i++) {
            // 수가 너무 커지므로 세번째 수부터 1234567로 나눈 나머지를 더함
            answer = fibo1 % 1234567 + fibo2 % 1234567;
            fibo1 = fibo2; // n - 1 번째 피보나치 수
            fibo2 = answer; // n - 2 번째 피보나치 수
        }
        // 최종 결과값도 1234567로 나눈 나머지 반환
        return answer % 1234567;
    }

    public static void main(String[] args) {
        FibonacciNum fn = new FibonacciNum();
        int n = 1_000_000;

        System.out.println(fn.solution(n));
    }
}
