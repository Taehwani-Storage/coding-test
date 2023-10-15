package Backtrack;

import java.io.IOException;
import java.util.Scanner;

public class NQueen {
    // 핀을 ipt[][] 다 구현하는 방법
    // 각 줄의 어느 위치에 퀸이 존재하는 지를 기록하는 방법
    private int[] queenPos;
    private int size; // N
    private int count; // 몇개의 핀을 놓았는지

    public int solution() throws IOException {
        Scanner scan = new Scanner(System.in);
        size = Integer.parseInt(scan.nextLine());
        queenPos = new int[size];
        count = 0;
        setQueenPos(0);
        return count;
    }
    // row 번째 줄에 Queen 배치할 차례
    private void setQueenPos(int row) {
        // 전부 배치 완료
        if (row == size) count++;
        else {
            for (int i = 0; i < size; i++) {
                // row 번째 Queen의 위치는 순회중인 i
                queenPos[row] = i;
                // 이번줄에 배치한 결과가 조건에 부합하면 다음줄로
                if (checkQueen(row)) setQueenPos(row + 1);
            }
        }
    }
    // 현재 배치가 N-Queen 문제의 답의 요구사항을 만족하는지
    private boolean checkQueen(int row) {
        for (int i = 0; i < row; i++) {
            // 1. 세로줄에 겹치는지
            if (queenPos[i] == queenPos[row])
                return false;
            // 2. 대각선에 겹치는지
            else if (Math.abs(queenPos[i] - queenPos[row]) == row - i)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new NQueen().solution());

    }
}
