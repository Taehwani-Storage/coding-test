package programmers.Lv0;

public class PlayBall {
    public int solution(int[] numbers, int k) {
        int answer;
        // 오른쪽으로 한 명 건너뛰기 위해 idx 값에 2씩 더함
        int jump = 0;
        for (int i = 1; i < k; i++)
            jump += 2;

        jump %= numbers.length; // # 핵심 #
        answer = numbers[jump];
        return answer;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int k = 10;
        PlayBall pb = new PlayBall();

        System.out.println(pb.solution(num, k));
    }
}
