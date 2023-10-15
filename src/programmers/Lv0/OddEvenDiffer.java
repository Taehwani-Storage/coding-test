package programmers.Lv0;

public class OddEvenDiffer {
    public int solution(int n) {
        int answer = 0;

        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++){
                if (i % 2 != 0)
                    answer += i;
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    answer += (i*i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        OddEvenDiffer oed = new OddEvenDiffer();
        int n = 10;

        System.out.println(oed.solution(n));
    }
}
