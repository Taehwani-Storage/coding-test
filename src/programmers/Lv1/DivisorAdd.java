package programmers.Lv1;

public class DivisorAdd {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt; // 약수 개수

        for (int i = left; i <= right; i++) {
            cnt = 0;
            // left와 right 사이의 모든 수 약수 구하기
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            // 약수 개수 짝수면 더하고 홀수면 빼기
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer += i * -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DivisorAdd da = new DivisorAdd();
        int left = 13;
        int right = 17;

        System.out.println(da.solution(left, right));
    }
}
