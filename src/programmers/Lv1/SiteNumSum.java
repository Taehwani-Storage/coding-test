package programmers.Lv1;

public class SiteNumSum {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        SiteNumSum sns = new SiteNumSum();
        int NUM = 987;

        System.out.println(sns.solution(NUM));

    }
}
