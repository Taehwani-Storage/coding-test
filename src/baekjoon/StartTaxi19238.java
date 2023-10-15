package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartTaxi19238 {
    private int size;
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());
        size = Integer.parseInt(infoToken.nextToken());
        int goalCount = Integer.parseInt(infoToken.nextToken());
        int fuel = Integer.parseInt(infoToken.nextToken());
        int[][] map = new int[size][size];

        for (int i = 0; i < size; i++) {
            StringTokenizer rowToken = new StringTokenizer(reader.readLine());
            for (int j = 0; j < size; j++) {
                if (Integer.parseInt(rowToken.nextToken()) == 1) map[i][j] = 1;
            }
        }

        StringTokenizer startToken = new StringTokenizer(reader.readLine());
        int[] start = new int[]{
                Integer.parseInt(startToken.nextToken()) - 1,
                Integer.parseInt(startToken.nextToken()) - 1
        };

        int[][] customers = new int[goalCount][];
        int[][] goals = new int[goalCount][];

        for (int i = 0; i < goalCount; i++) {
            StringTokenizer customerToken = new StringTokenizer(reader.readLine());
            customers[i] = new int[]{
                    Integer.parseInt(customerToken.nextToken()) - 1,
                    Integer.parseInt(customerToken.nextToken()) - 1
            };
            goals[i] = new int[]{
                    Integer.parseInt(customerToken.nextToken()) - 1,
                    Integer.parseInt(customerToken.nextToken()) - 1
            };
        }
        // 승객을 잘 보내줬는지
        boolean[] done = new boolean[goalCount];
        int[][] deltas = new int[][]{
                new int[]{-1, 0},
                new int[]{1, 0},
                new int[]{0, -1},
                new int[]{0, 1},
        };

        return -1;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new StartTaxi19238().solution());
    }
}

