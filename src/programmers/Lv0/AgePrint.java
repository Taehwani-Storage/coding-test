package programmers.Lv0;

public class AgePrint {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }

    public static void main(String[] args) {
        AgePrint agePrint = new AgePrint();
        int age = 23;

        System.out.println(agePrint.solution(age));
    }
}
