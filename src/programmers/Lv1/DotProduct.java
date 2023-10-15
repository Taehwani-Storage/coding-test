package programmers.Lv1;

public class DotProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        // 내적: 같은 인덱스 값 곱하기 후 모두 더하기
        for (int i = 0; i < a.length; i++)
            answer += a[i] * b[i];

        return answer;
    }

    public static void main(String[] args) {
        DotProduct dotProduct = new DotProduct();
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        System.out.println(dotProduct.solution(a, b));
    }
}
