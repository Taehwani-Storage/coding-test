package programmers.Lv1;

public class MatrixSum {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 2차원 배열 정의, [한 개의 배열 인덱스][해당 배열의 다음 인덱스]
        int[][] answer = new int[arr2.length][arr2[1].length];
        // 배열 인덱스 끼리 합하기
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MatrixSum ms = new MatrixSum();
        int[][] arr1 = {{1,2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] result = ms.solution(arr1, arr2);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.printf("%d", result[i][j]);
            }
            System.out.printf(" ");
        }
    }
}
