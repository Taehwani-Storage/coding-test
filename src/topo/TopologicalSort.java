package topo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class TopologicalSort {
    private List<List<Integer>> adjList;
    private int nodes;

    public void topologicalSort() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer((reader.readLine()));

        nodes = Integer.parseInt(infoToken.nextToken()); // 정점 갯수 기록
        int edges = Integer.parseInt(infoToken.nextToken()); // 간선 갯수 기록
        for (int i = 0; i< nodes; i++) { // 인접 리스트 초기화
            adjList.add(new ArrayList<>());
        }
        // 그래프 입력
        for (int i = 0; i < edges; i++) {
            StringTokenizer edgeToken = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(edgeToken.nextToken());
            int end = Integer.parseInt(edgeToken.nextToken());
            adjList.get(start).add(end);
        }
        kahn();
    }
    // nodes: 정점 갯수, adjList: 인접 리스트
    private void kahn() {
        int[] inDegrees = new int[nodes]; // 1 진입 차수 구하기
        // List<Integer> neighbors: 각 정점에서 도달 가능한 정점 리스트
        for (List<Integer> neighbors: adjList) {
            // neighbor: 그 정점에서 도달 가능한 정점들 (개별)
            for(int neighbor: neighbors) {
                // 그들의 진입차수를 높이기
                inDegrees[neighbor]++;
            }
        }
        // 2 진입 차수가 0인 정점을 Queue에 삽입
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nodes; i++) {
            if (inDegrees[i] == 0) queue.offer(i);
        }
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) { // 3-1 Queue가 비어있지 않은 동안
            int node = queue.poll(); // 이번 정점
            result.add(node);
            // 3-2 현재 정점의 인접 정점들의 진입 차수 줄이기
            for (int neighbor: adjList.get(node)) {
                inDegrees[neighbor]--;
                // 3-3 진입 차수가 0이 되면 방문 가능 (Queue에 삽입)
                if (inDegrees[neighbor] == 0) queue.offer(neighbor);
            }
        }
        // 4 결과 확인, 실제 정점 갯수보다 위상정렬 정점 갯수가 적으면 불가
        if (result.size() < nodes) {
            System.out.println(new ArrayList<>());
        } else
            System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new TopologicalSort().topologicalSort();
    }
}
/*
7 9
0 1
0 2
1 3

 */