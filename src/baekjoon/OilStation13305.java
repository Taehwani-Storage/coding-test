package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OilStation13305 {
    public long solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long cityCount = Integer.parseInt(reader.readLine());
        StringTokenizer cityDistToken = new StringTokenizer(reader.readLine());
        long[] cityDistance = new long[(int) (cityCount - 1)]; // 각 도시들 간의 거리 n - 1
        for (int i = 0; i < cityCount; i++) {
            cityDistance[i] = Integer.parseInt(cityDistToken.nextToken());
        }

        StringTokenizer cityFuelToken = new StringTokenizer(reader.readLine());
        long[] cityFuel = new long[(int) cityCount]; // 각 도시의 기름값 정보
        for (int i = 0; i < cityCount; i++) {
            cityFuel[i] = Integer.parseInt(cityFuelToken.nextToken());
        }

        long currentMin = Integer.MAX_VALUE; // 최소 기름값 저장 변수
        long needToGo = 0; // 현재 도시에서 기름값이 싼 도시까지 걸린 거리
        long totalPrice = 0; // 총 주유비
        for (int i = 0; i < cityCount - 1; i++) { // 얼만큼 이동했는지만 알기 위해 (-1)
            if (cityFuel[i] < currentMin) {
                // 해당 도시까지 걸린 거리만큼 이전 최솟값 도시에서 넣어야 함
                totalPrice += currentMin * needToGo;
                currentMin = cityFuel[i]; // 기름 최솟값 갱신
                needToGo = cityDistance[i]; // 다음 도시까지의 거리
            } else {
                needToGo += cityDistance[i]; // 다음 도시까지 더 가야됨
            }
        }
        // 마지막 주유비를 계산하여 반환
        return totalPrice + needToGo * currentMin;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(new OilStation13305().solution());

    }
}

/*
4
2 3 1
5 2 4 1
 */