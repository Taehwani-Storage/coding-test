package programmers.Lv1;

public class FindMean {
    public double solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++)
            answer += arr[i];

        return answer / arr.length;
    }

    public static void main(String[] args) {
        FindMean fm = new FindMean();
        int[] arr = {5,5};

        System.out.println(fm.solution(arr));
    }
}
