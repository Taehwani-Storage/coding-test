package programmers.Lv1;

public class EvenOdd {
    public String solution(int num) {
//        String answer = "";
//        if (num % 2 == 0)
//            answer = "Even";
//        else
//            answer = "Odd";
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        int num = 100;

        System.out.println(evenOdd.solution(num));
    }
}
