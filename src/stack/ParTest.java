package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParTest {
    public boolean solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

//        Stack<Character> charStack = new Stack<>();
//        문자열 길이만큼 순회
        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);
//            1. 여는 괄호를 만나면 push
            if (next == '(') {
//                charStack.push(next);
//            }
////            2. 닫는 괄호를 만나면
//            else if (next == ')') {
////                a. pop 할게 없으면 검사 실패(false 반환)
////                   -> 스택이 비어있음
//                if (charStack.empty()) return false;
////                b. 아니라면 pop
//                char top = (char) charStack.pop();
//                c. pop의 결과로 나온 값이 여는 괄호인지 확인
//                   -> 여는 괄호가 아니면 실패
//                if (top != '(') return false;
            }
        }
        return solution();
    }

    public static void main(String[] args) {
        int[] input = new int[1];

    }
}
