package programmers.Lv1;

public class HashadNum {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int num = x;

        while (num >= 1) {
            sum += num % 10;
            num /= 10;
        }
        return x % sum == 0 ? answer : false;
    }

    public static void main(String[] args) {
        HashadNum hn = new HashadNum();
        int x = 12;

        System.out.println(hn.solution(x));
    }
}
