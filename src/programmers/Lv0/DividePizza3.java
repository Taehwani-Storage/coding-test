package programmers.Lv0;

public class DividePizza3 {
    public int solution(int slice, int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(slice * i >= n) {
                answer = i;
                break;
            }
        }
        return answer;
//        return n % slice > 0 ? n/slice+1 : n/slice;
    }
    public static void main(String[] args) {
        int s = 10;
        int n = 2;
        DividePizza3 dp3 = new DividePizza3();

        System.out.println(dp3.solution(s, n));
    }
}
