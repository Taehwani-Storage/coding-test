package ssafy.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1787 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Scanner sc = new Scanner(System.in);

        String testCnt = br.readLine();

        for (int i = 0; i < Integer.parseInt(testCnt); i++) {
            String num1 = br.readLine();
            String num2 = br.readLine();

            System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
        }
        br.close();

    }
}
