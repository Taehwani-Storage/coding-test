package programmers.Lv1;

public class SqrtDiscriminator {
    public long solution(long n) {
        long answer = (int) Math.sqrt(n);

        return (int) Math.pow(answer, 2) == n ? (int) Math.pow(answer + 1, 2) : -1;
    }

    public static void main(String[] args) {
        SqrtDiscriminator sd = new SqrtDiscriminator();
        int n = 3;

        System.out.println(sd.solution(n));
    }
}
