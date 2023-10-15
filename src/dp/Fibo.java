package dp;

public class Fibo {
    // n을 입력받고 n번째 피보나치 수열 출력
    public int fiboSimple(int n) {
        if (n == 0) return 0; // k = 0
        if (n == 1 || n == 2) return 1; // k = 1, k = 2
        // F(k) == F(k - 1) + F(k - 2)
        return fiboSimple(n - 1) + fiboSimple(n - 2 );
    }

    // 외부 호출 위한 메소드
    public int fiboMemo(int n) {
        return fiboMemoRe(n, new int[n + 1]);
    }

    private int fiboMemoRe(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        // 구한 결과가 있다면 이것이 저장된 memo를 확인
        else if (memo[n] == 0) { // 아직 그 결과가 없다면
            // 여기에서 결과를 구해서 기록
            memo[n] = fiboMemoRe(n - 1, memo) + fiboMemoRe(n - 2, memo);
        }
        // memo[n]이 있다면, 해당 값이 지금 구하고 있는 n번째 피보나치 수열 값
        return memo[n];
    }

    public int fiboTab(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        // 계산 결과 기록용 배열
        int[] fib = new int[n + 1];
        // 알고 있는 결과는 미리 기록
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        int n = 20;
        // fiboSimple 계산
        long start = System.nanoTime();
        System.out.println("simple");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(fibo.fiboSimple(i)).append(' ');
        }
        System.out.println(result);
        System.out.println(System.nanoTime() - start);
        System.out.println();
        // fiboMemo 계산
        start = System.nanoTime();
        System.out.println("memo");
        result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(fibo.fiboMemo(i)).append(' ');
        }
        System.out.println(result);
        System.out.println(System.nanoTime() - start);
        System.out.println();

        // fiboTab 계산
        start = System.nanoTime();
        System.out.println("tab");
        result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(fibo.fiboTab(i)).append(' ');
        }
        System.out.println(result);
        System.out.println(System.nanoTime() - start);
    }
}
