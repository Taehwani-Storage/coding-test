package programmers.Lv0;

public class IntegerChange {
    public int solution(String s) {
        // int answer = 0;
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        IntegerChange ic = new IntegerChange();
        String str = "-1234";

        System.out.println(ic.solution(str));
    }
}
