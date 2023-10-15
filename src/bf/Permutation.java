//package bf;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class Permutation {
//    // x의 변화
//    private final int[] dx = {-1, 1, 0, 0, 0, 0};
//    // y의 변화
//    private final int[] dy = {0, 0, -1, 1, 0, 0};
//    // h의 변화
//    private final int[] dh = {0, 0, 0, 0, -1, 1};
//    // 상자의 크기
//    private static int x;
//    private static int y;
//    private static int h;
//
//    private boolean checkBounds(int x, int y, int h) {
//        return -1 < x && x < this.x
//                && -1 < y && y < this.y
//                && -1 < h && h < this.h;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        // 첫줄 `X Y H` 가 들어온다.
//        StringTokenizer infoParser = new StringTokenizer(reader.readLine());
//        x = Integer.parseInt(infoParser.nextToken());
//        y = Integer.parseInt(infoParser.nextToken());
//        h = Integer.parseInt(infoParser.nextToken());
//        // 토마토 정보를 담을 상자 3차원 배열
//        int[][][] tomatoRack = new int[h][y][x];
//
//        // 데이터 입력 받으면서 첫번째 방문 위치 찾기
//        Queue<int[]> toVisit = new LinkedList<>();
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < y; j++) {
//                for (int k = 0; k < x; k++) {
//
//                }
//            }
//        }
//        // 데이터 입력 받으면서 첫번째 방문 위치 찾기
//        Queue<int[]> toVisit = new LinkedList<>();
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < y; j++) {
//                StringTokenizer rowParser = new StringTokenizer(reader.readLine());
//                for (int k = 0; k < x; k++) {
//                    // 토마토 정보 받아오기
//                    int tomato = Integer.parseInt(rowParser.nextToken());
//                    if (tomato == 1) {
//                        // 이미 익은 토마토들 부터 시작, {h, y, x, days}
//                        toVisit.add(new int[]{i, j, k, 0});
//                    }
//                }
//            }
//        }
//        // 총 일수 저장용 변수
//        int days = 0;
//        // BFS 시작
//        while (!toVisit.isEmpty()) {
//            int[] tomato = toVisit.poll();
//            // 이번에 확인한 토마토가 익은 시점이 현재 기록된 시간보다 늦을 경우 갱신한다.
//            if (days != tomato[3]) days = tomato[3];
//            // 상하좌우 + 위아래 체크
//            for (int i = 0; i < 6; i++) {
//                // 다음 확인 좌표
//                int nextH = tomato[0] + dh[i];
//                int nextY = tomato[1] + dy[i];
//                int nextX = tomato[2] + dx[i];
//                if (
//                    // 1. 영역을 벗어나지 않는다
//                        checkBounds(nextX, nextY, nextH)
//                                // 2. 익지 않은 토마토이다.
//                                && tomatoRack[nextH][nextY][nextX] == 0
//                ) {
//                    // 토마토를 익음으로 표시
//                    tomatoRack[nextH][nextY][nextX] = 1;
//                    // 다음날에 이 토마토는 익어있습니다.
//                    toVisit.offer(new int[]{nextH, nextY, nextX, tomato[3] + 1});
//                }
//            }
//        }
//        // 0 ~ 2 사이의 3개의 숫자가 있다.
//        // 겹치지 않도록 3개를 골라 나열한 모든 경우의 수를 출력해보자.
//        // 1. 첫번째 숫자를 For 반복으로 구합니다.
//        for (int i = 0; i < 3; i++) {  // i가 고른 첫번째 숫자
//            // 2. 두번째 숫자를 for 반복으로 구합니다
//            for (int j = 0; j < 3; j++) {  // j가 고른 두번째 숫자
//                // 만약 이미 고른 숫자라면 스킵
//                if (i == j) continue;
//                // 3. 세번째 숫자를 for 반복으로...
//                for (int k = 0; k < 3; k++) {  // k가 고른 세번째 숫자
//                    // 만약 이미 고른 숫자라면 스킵
//                    if (k == i || k == j) continue;
//                    System.out.println(i + " " + j + " " + k);
//                }
//            }
//        }
//        // 숫자 야구 용 순열 생성기
//        for (int i = 1; i < 10; i++) {  // 1부터 9까지
//            for (int j = 1; j < 10; j++) {
//                if (i == j) continue;
//                for (int k = 1; k < 10; k++) {
//                    if (k == i || k == j) continue;
//                    // TODO 주어진 조건을 만족하는지 테스트
//                }
//            }
//        }
//        Permutation perm = new Permutation();
//        perm.permNumbers(5, 3, 0,
//                // 고른 숫자가 담기는 배열이기 때문에 r의 크기를 같는 배열
//                new int[3],
//                // 고를 수 있는 숫자가 골라졌는지 판단하는 배열이기 떄문에, n의 크기를 갖는 배열
//                new boolean[5]
//        );
//    }
//    private void permNumbers(
//            // 0 ~ n 까지 숫자 중
//            int n,
//            // r개를 뽑아서 나열
//            int r,
//            // 이번에 몇번째 것을 뽑는건지 (재귀 조건)
//            int k,
//            // 여태까지 만든 순열
//            int[] perm,
//            // 이 숫자를 사용한 적 있는지 여부에 대한 used
//            boolean[] used
//    ) {
//        for (int i = 0; i < n; i++) {
//            // 이미 사용한 숫자인지
//            if (used[i]) continue;
//            // 이번 숫자를 선택해서 저장
//            perm[k] = i;
//            used[i] = true;
//            // 다음 숫자 정하기 위한 재귀 호출
//            this.permNumbers(n, r,k + 1, perm, used);
//            // i를 k의 위치에 담았으면 i를 다시 사용가능한 상태로
//            used[i] = false;
//        }
//
//    }
//}
