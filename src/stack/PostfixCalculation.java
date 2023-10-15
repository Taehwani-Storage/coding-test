package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostfixCalculation {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

//        Stack<Integer> digitStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);
//            1. 숫자라면, 스택에 push

//            2. 숫자가 아니라면 (연산자) 스택에 두번 pop하고 계산

        }
    }


    public static void main(String[] args) {
//        new PostfixCalculation().solution();
    }
}
