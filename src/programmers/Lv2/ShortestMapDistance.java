package programmers.Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestMapDistance {
    //이동 방향을 저장하는 방위
    static int dy[] = {1, -1, 0, 0};
    static int dx[] = {0, 0, -1, 1};

    public int solution(int map[][]) {
        int mapY = map.length;//맵의 세로 길이
        int mapX = map[0].length;//맵의 가로 길이
        Queue<int[]> qu = new LinkedList<>();//BFS의 핵심 QUEUE
        boolean visited[][] = new boolean[mapY][mapX];//방문 여부를 저장하는 배열
        
        qu.add(new int[] {0, 0, 1});//시작 점 넣고 시작!
        int result = 0;//결과를 저장할 변수

        while (!qu.isEmpty()){
            int current[] = qu.poll();//

            int curY = current[0];//현재 Y좌표
            int curX = current[1];//현재 X 좌표
            int count = current[2];//바닥에 쓰는 수 (현재 좌표까지 오는데 넘어온 칸수)

            //현재 좌표가 방문한 곳인지 다시 확인하기.
            if (visited[curY][curX]) continue;
            visited[curY][curX] = true;

            if (curY == mapY-1 && curX == mapX-1) {//현재 좌표가 목적지에 도착했다면.
                result = count;
                break;
            }
            //4방향 방위 조사 (현재 좌표 기점으로 4방향 조사 시작)
            for (int i = 0; i < 4; i++){
                //방문 조사를 시작할 좌표 구하기
                int ny = curY + dy[i];
                int nx = curX + dx[i];

                if (ny < 0 || ny >= mapY || nx < 0 || nx >= mapX) continue;//맵 경계선을 넘어가는지 검사
                if (map[ny][nx] == 0) continue;//벽인지 검사 (벽이라면 map[ny][nx] 가 0이다)
                if (visited[ny][nx]) continue;//방문한 장소인지 확인

                qu.add(new int[] {ny, nx, count+1});//방문 조사하기 안전한 장소라고 판단되면 qu에 넣는다.
            }
        }
        if (result == 0) return -1;//result = 0이다? -> 목적지에 도달한 적이 없다! 따라서 return -1
        return result;//결과 리턴
    }

    public static void main(String[] args) {
        ShortestMapDistance smd = new ShortestMapDistance();
        int[][] inMaps = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,0}, {0,0,0,0,1}};

        System.out.println(smd.solution(inMaps));
    }
}
