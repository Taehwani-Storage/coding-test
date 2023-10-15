package programmers.Lv0;

public class MeanArray {
    public double solution(int[] numbers) {
        int end = numbers.length -1;
        double answer = 0;

        answer = numbers[end] + numbers[0];
        answer *= 0.5;
        return answer;
    }

    public static void main(String[] args) {
        MeanArray meanArray = new MeanArray();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.printf("%.1f", meanArray.solution(numbers));
    }
}
