package programmers.Lv1;

public class NumPandY {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        // 문자열을 읽어서 p나 P가 나오면 p개수 + 1
        // 문자열을 읽어서 y나 y가 나오면 y개수 + 1
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
                pCount++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                yCount++;
        }
        // p와 y 개수가 다르면 false 반환
        if (pCount != yCount)
            answer = false;

        return answer;
    }

    public static void main(String[] args) {
        String s = "Pyy";
        NumPandY npy = new NumPandY();

        System.out.println(npy.solution(s));

    }
}
