package programmers.Lv1;

public class NoneNumSum {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int number : numbers)
            answer += number;

        return answer != 45 ? 45 - answer : answer;
    }

    public static void main(String[] args) {
        NoneNumSum nns = new NoneNumSum();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        System.out.println(nns.solution(numbers));
    }
}
