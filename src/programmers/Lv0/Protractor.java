package programmers.Lv0;

public class Protractor {
    public int solution(int angle) {
        int answer = 0;

        if (angle > 0 && angle < 90)
            answer = 1;
        else if (angle == 90)
            answer = 2;
        else if (angle < 180)
            answer = 3;
        else
            answer = 4;

        return answer;
    }

    public static void main(String[] args) {
        Protractor protractor = new Protractor();
        int angle = 179;

        System.out.println(protractor.solution(angle));

    }
}
