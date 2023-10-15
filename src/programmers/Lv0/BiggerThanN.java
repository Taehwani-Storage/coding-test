package programmers.Lv0;

public class BiggerThanN {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        int i = 0;
        while (n >= 0) { // 항상 참이 되는 조건
            answer += numbers[i++];
            if (answer > n) // n보다 커지면 반복 멈추고
                break;
        }
        return answer; // 합한 값 반환
    }

    public static void main(String[] args) {
        BiggerThanN BtN = new BiggerThanN();
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;

        System.out.println(BtN.solution(numbers, n));
    }
}
