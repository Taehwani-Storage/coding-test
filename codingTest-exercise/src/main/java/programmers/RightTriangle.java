package programmers;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
