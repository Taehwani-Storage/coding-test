package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower1914 {
    private StringBuilder towerBuilder;

    public void solution() throws IOException {
        int n = Integer.parseInt(
                new BufferedReader(new InputStreamReader(System.in)).readLine());
//        System.out.println((int) (Math.pow(2, n) - 1)); // 2^n - 1
        this.towerBuilder = new StringBuilder();
        this.towerBuilder
                .append((int) (Math.pow(2, n) - 1))
                .append("\n");
        hanoi(n , 1, 3, 2);
        System.out.println(this.towerBuilder.toString());
    }
    // height : 옮기고자 하는 탑 높이
    // start : 시작 위치, end : 목표 위치
    // other : 이동하지 않는 위치(재귀 호출시, end로 바로가지 않고 other로 보내야되기 때문)
    public void hanoi(int height, int start, int end, int other) {
        if (height == 1) {
            this.towerBuilder.append(start + " " + end + "\n");
        } else { // n보다 작은 원반들을 start에서 other
            hanoi(height - 1, start, other, end);
            // n번째 원반을 start에서 end로 이동
            this.towerBuilder.append(start + " " + end + "\n");
            // n보다 작은 원반들을 other에서 end로 dlehd
            hanoi(height - 1, other, end, start);

        }
    }

    public static void main(String[] args) throws IOException {
        new HanoiTower1914().solution();
    }
}
