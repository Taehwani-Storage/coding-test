package baekjoon;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree1992 {
    // 입력에 대한 정보를 클래스 필드 저장(입력된 0과 1로 구성된 이미지)
    private char[][] image;
    public StringBuilder quadTreeBuilder; // 결과 저장

    private void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        image =new char[n][];
        for (int i = 0; i < n; i++) {
            image[i] = reader.readLine().toCharArray(); // 문자열 char[]로 변환
        }
        quadTreeBuilder = new StringBuilder();
        compressQuad(n, 0, 0);
        System.out.println(quadTreeBuilder.toString());
    }
    // n: 정사각형 한 변, x: 정사각형 시작x index, y: 정사각형 시작y index
    private void compressQuad(int n, int x, int y) {
        boolean success = true; // 조건을 만족했는지 검사 flag
        // x, y의 값을 저장, x ~ x + n - 1, y ~ y + n - 1까지 반복하면서
        // 초기의 값과 달라지는지를 검사
        char init = image[x][y];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (image[x + i][y + j] != init) {
                    success = false;
                    break;
                }
            }
            if (!success) break;
        }
        if (!success) { // 원소 검사 후 success == false 면 쪼개서 재귀호출
            quadTreeBuilder.append('('); // 좌 괄호 입력
            int half = n / 2; // 4등분을 위한 half
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    compressQuad(half, x + half * i, y + half * j);
                }
            }
            quadTreeBuilder.append(')'); // 4등분
        } else {
            quadTreeBuilder.append(init); // 모든 원소가 일치, 첫번째 검사한 원소 출력
        }

    }

    public static void main(String[] args) throws IOException {
        new QuadTree1992().solution();
    }
}
