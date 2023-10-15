package programmers.Lv1;

public class ClapLoop {
    public String solution(int n) {
        String answer = "";
        // 홀수일 때 '수', 짝수일 때 '박' 출력
        for (int i = 0; i < n; i++)
            // 출력값 이어 붙이기
            answer += i % 2 == 0 ? "수" : "박";
        return answer;
    }

    public static void main(String[] args) {
        ClapLoop cl = new ClapLoop();
        int n = 10;

        System.out.println(cl.solution(n));
    }
}
