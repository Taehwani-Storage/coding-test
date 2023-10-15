package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bishop1799 {
    private List<int[]> whitePoints; // 하얀 비숍이 들어가는 칸
    private int whiteMax; // 하얀 칸에 놓을 수 있는 비숍 최대 갯수
    private List<int[]> blackPoints; // 검은 비숍이 들어가는 칸
    private int blackMax; // 검은 칸에 놓을 수 있는 비숍 최대 갯수

    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        whitePoints = new ArrayList<>();
        whiteMax = 0;
        blackPoints = new ArrayList<>();
        blackMax = 0;

        for (int i = 0; i < size; i++) {
            StringTokenizer boardToken = new StringTokenizer(reader.readLine());
            for (int j = 0; j < size; j++) {
                if (Integer.parseInt(boardToken.nextToken()) == 1) {
                    // 검은색인지 하얀색인지
                    if ((i + j) % 2 == 0) whitePoints.add(new int[] {i , j});
                    else blackPoints.add(new int[] {i, j});
                }
            }
        }
        dfsWhite(0, new boolean[whitePoints.size()]);
        dfsBlack(0, new boolean[blackPoints.size()]);

        return whiteMax + blackMax;
    }

    // 하얀색 비숍을 DFS하는 합수
    // next: 다음에 고려할 비숍이 놓일 하얀칸의 인덱스, selected: 몇번째 비숍 칸들을 선택했는지
    private void dfsWhite(int next, boolean[] selected) {
        if (next == whitePoints.size()) {
            int count = 0; // 이번에 완성한 비숍들이 총 몇개 쓰였는지
            for (boolean select: selected) {
                if (select) count += 1;
            }
            whiteMax = Math.max(whiteMax, count); // 최댓값 갱신
        }
        else { // 탐색하기
            selected[next] = true;
            // 다음 단께로 넘어가기 전에 가양성 조사
            if (checkWhite(next, selected)) dfsWhite(next + 1, selected);
            selected[next] = false;
            dfsWhite(next + 1, selected);
        }
    }
    // 하얀색 비숍들이 서로 공격하지 못하는 확인하는 함수
    private boolean checkWhite (int next, boolean[] selected) {
        int[] point = whitePoints.get(next); // 마지막으로 선택한 비숍
        for (int i = 0; i < next; i++) {
            if (
                    selected[i] &&
                    Math.abs(whitePoints.get(i)[0] - point[0]) ==
                    Math.abs(whitePoints.get(i)[1] - point[1])
            )
                return false;
        }
        return true;
    }
    // 검은색 비숍을 DFS 하는 함수
    private void dfsBlack(
            // 다음에 고려할 비숍이 놓일 칸
            // 의 blackPoints 인덱스
            int next,
            // 몇번째 비숍 칸들을 선택했는지
            boolean[] selected
    ) {
        // 종료조건 next == whitePoints.size()
        if (next == blackPoints.size()) {
            // 이번에 완성한 비숍들이 총 몇개가 쓰였는지
            int count = 0;
            for (boolean select: selected) {
                if (select) count += 1;
            }
            // 최댓값 갱신
            blackMax = Math.max(blackMax, count);
        }
        // 탐색하기
        else {
            selected[next] = true;
            // 다음 단계로 넘어가기 전에 가망성 조사를 해야한다.
            if (checkBlack(next, selected)) dfsBlack(next + 1, selected);
            selected[next] = false;
            dfsBlack(next + 1, selected);
        }
    }

    // 검은색 비숍들이 서로 공격하지 못하는지 확인하는 함수
    private boolean checkBlack(int next, boolean[] selected) {
        // 마지막으로 선택한 비숍
        int[] point = blackPoints.get(next);
        for (int i = 0; i < next; i++) {
            if (
                    selected[i] &&
                    Math.abs(blackPoints.get(i)[0] - point[0]) ==
                    Math.abs(blackPoints.get(i)[1] - point[1])
            ) return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(new Bishop1799().solution());
    }
}
