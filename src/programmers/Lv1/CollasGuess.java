package programmers.Lv1;

public class CollasGuess {
    // num의 범위로 long 사용
    public int solution(long num) {
        int answer = 0;
        // 입력값이 1이 아니고 연산횟수 500 이하면 반복
        while(num != 1 && answer <= 500){
            num = num % 2 == 0 ? num /= 2 : (num * 3) + 1;
            answer++;
        }
        // 연산횟수 500 이하면 answer 반환, 초과되면 -1 반환
        return answer != 501 ? answer : -1;
    }

    public static void main(String[] args) {
        CollasGuess cg = new CollasGuess();
        int n = 626331;

        System.out.println(cg.solution(n));
    }
}
